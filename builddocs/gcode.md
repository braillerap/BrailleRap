# GCODE Reference

If you have build a BrailleRAP, you know the machine is build from a 3d printer controller. We use a controller with a customized [marlin firmware](https://github.com/MarlinFirmware/Marlin) to control every features of the BrailleRAP (motors, endswitches, solenoid ...). **Marlin** use GCODE commands to communicate with USB host, allowing a laptop to control a BrailleRAP.

GCODE is a common standard, you will find here some details about GCODE usage in BrailleRAP


## Homing
Before we can start moving the 2 carriages, we need to find a reference position. The reference position (0,0) need to be at the top left corner of the sheet.

`G28 X` Homing X axis.\
`G28 Y` Homing Y axis. BrailleRAP will use the paper sensor to find the top edge of the sheet.\

## Get limit status
`M119` Read the limit switches status

`> M119
x_min: open
y_min: open
z_min: TRIGGERED
`

## Move to
`G1 Xxx.xx Yyy.yy` Where **xx.xx** is the X position in **mm** and **yy.yy** is the Y position in **mm**.


## Set speed
`G1 Fxxxxx` Where **xxxxx** is the speed in **mm/mn**


## Make a dot

`M3 S1` Activate the solenoid.\
`M3 S0` Deactivate the solenoid.\

<div class="admonition warning">
  <div class="title">Attention</div>
  <p>
  Note that you can't activate the solenoid while moving.
  </p>
</div>