package com.theapache64.switchsnake.composable

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.theapache64.switchsnake.CellType

@Composable
fun BoxScope.CellTypeController(
    cellType: CellType,
    onCellTypeChanged: (CellType) -> Unit,
) {

    Row(
        modifier = Modifier
            .align(Alignment.BottomCenter)
            .padding(bottom = 10.dp)
    ) {

        // Switch
        CustomRadioButton(
            selected = cellType == CellType.Switch,
            onClick = {
                onCellTypeChanged(CellType.Switch)
            },
            text = "Switch"
        )

        // Checkbox
        CustomRadioButton(
            selected = cellType == CellType.CheckBox,
            onClick = {
                onCellTypeChanged(CellType.CheckBox)
            },
            text = "CheckBox"
        )

        // Radio
        CustomRadioButton(
            selected = cellType == CellType.Radio,
            onClick = {
                onCellTypeChanged(CellType.Radio)
            },
            text = "Radio"
        )

        // Game
        CustomRadioButton(
            selected = cellType == CellType.Game,
            onClick = {
                onCellTypeChanged(CellType.Game)
            },
            text = "Game"
        )
    }
}