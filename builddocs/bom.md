# Bill of Material

## Notes about BrailleRAP/BrailleRAP XL

BrailleRAP now exists in 2 different models: **BrailleRAP** and **BrailleRAP XL**.

**BrailleRAP** is the original version and can accommodate paper sheets of **A4** or smaller.

- Braillerap_v6-5-1_600x400-planche1.svg
- Braillerap_v6-5-1_600x400-planche2.svg

**BrailleRAP XL** is a larger version and can accommodate paper sheets of **A3** or smaller.

- brapxl-v6-6-planche1_900x400.svg
- brapxl-v6-6-planche2_900x400.svg

*Assembly of the 2 versions is largely similar. The main differences are:*

- *Assembly of the paper tray*
- *The number of paper rollers*
- *The length of the linear rods and belts*
- *BrailleRAP XL requires more precise mechanical assembly*

## Notes about frame material
Early in 2018, at the start of the project, we used to build BrailleRAP in plywood. Since the Hackaday Prize in 2023, i build every BrailleRAP with clear PMMA. 

## Laser Cut parts

### For BrailleRAP

2 plywood sheets 5mm 600mm x 400mm.

The file for the laser cutter are available here : https://github.com/BrailleRap/BrailleRap/tree/master/lasercut
   * lasercut/Braillerap_v6-5-1_600x400-planche1.svg
   * lasercut/Braillerap_v6-5-1-600x400-planche2.svg


### For BrailleRAP XL

2 plywood sheets 5mm 900mm x 400mm.

The file for the laser cutter are available here : https://github.com/BrailleRap/BrailleRap/tree/master/lasercut
   * lasercut/brapxl-v6.6-planche1_900x400.svg
   * lasercut/brapxl-v6-6-planche2_900x400.svg


## Printed parts
All part are printed in ABS or PETG. 
- For ABS use 50% filling 3 permiters
- For PETG use 40% filling 6 perimeters

The files for the 3d printer are available here : https://github.com/braillerap/BrailleRap/tree/master/printed_parts
 

| Item                                 | Quantity (BrailleRAP) | Quantity (BrailleRAP XL) | Notes                            |
| ------------------------------------ | --------------------- | ------------------------ | ---------------------------------|
| **3D Printed Parts**                 |                       |                          |                                  |                
| BOTTOM_AXIS_left2                    | 1                     | 1                        | Axis support                     |
| TOP_AXIS_left2                       | 1                     | 1                        | Axis support                     |
| TOP_AXIS_right2                      | 1                     | 1                        | Axis support                     |
| BOTTOM_AXIS_right2                   | 1                     | 1                        | Axis support                     |
| XMOTOR_support3                      | 1                     | 1                        | X motor mount                    |
| XMOTOR_support3_1                    | 1                     | 1                        | X motor mount                    |
| YMOTOR_support2_200 series           | 3                     | 3                        | Y motor mount parts              |
| SWITCH_X_support                     | 1                     | 1                        | X limit switch                   |
| ELECTRO_MAGNET_housing2(_fit)        | 1                     | 1                        | Solenoid housing                 |
| DRIVEN_PULLEY_housing                | 2                     | 2                        | Belt tensioners                  |
| BOTTOM_trolley                       | 1                     | 1                        | Bottom carriage                  |
| TOP_trolley                          | 1                     | 1                        | Top carriage                     |
| FEMALE_shape                         | 1                     | 1                        | Braille die                      |
| ROLL_joint3                          | 3                     | 4                        | Paper rollers                    |
| clipboard2_support                   | 3                     | 4                        | Paper hold-down                  |
| clipboard2                           | 3                     | 4                        | Paper hold-down                  |
| CLIPBOARD2_WHEEL                     | 3                     | 4                        | Paper hold-down                  |
| KP08_support                         | 2                     | 2                        | Vertical axis                    |
| PAPER_GUIDE_left                     | 1                     | -                        | BrailleRAP paper guide           |
| PAPER_GUIDE_right                    | 1                     | -                        | BrailleRAP paper guide           |
| paper_guide_left_XL                  | -                     | 1                        | BrailleRAP XL paper guide        |
| paper_guide_right_XL                 | -                     | 1                        | BrailleRAP XL paper guide        |
| ENDSTOP_Y_support                    | 1                     | 1                        | Y limit switch                   |
| ENDSTOP_Y_lever_weight               | 1                     | 1                        | Y limit switch                   |
| LID_LOCK                             | 2                     | 2                        | Lid clips                        |
| POWER_plate                          | 1                     | 1                        | Power supply mount               |
| DOORLOCKER                           | 2                     | 2                        | Rear panel lock                  |
| ELECTRO_MAGNET_guide_fitxxx          | 1                     | 1                        | Solenoid guide (select best fit) |


## Laser Cut Parts
For years we used 5mm plywood to build BrailleRAP frame, and it work well. Since a few years, we started to use 5mm PMMA. The aesthetic is better, and i assume PMMA is not sensible to moist or temperature.

The files for laser cutter are available here : https://github.com/braillerap/BrailleRap/tree/master/lasercut


<div class="admonition tip">
  <div class="title">Note</div>
  <p>
  Please note that the frame parts are different for a BrailleRAP or a BrailleRAP XL
  </p>
</div>

| Item                                 | Quantity (BrailleRAP) | Quantity (BrailleRAP XL) | Notes                            |
| ------------------------------------ | --------------------- | ------------------------ | ---------------------------------|
| FACE (5mm)                           | 1                     | 1                        | Enclosure                        |
| BACK (5mm)                           | 1                     | 1                        | Enclosure                        |
| BOTTOM (5mm)                         | 1                     | 1                        | Enclosure                        |
| LEFT_SIDE (5mm)                      | 1                     | 1                        | Enclosure                        |
| RIGHT_SIDE (5mm)                     | 1                     | 1                        | Enclosure                        |
| PAPER_support (5mm)                  | 1                     | 1                        | Paper tray                       |
| Upper paper support                  | 1                     | 1                        | Paper tray                       |
| Lower paper support                  | 1                     | 1                        | Paper tray                       |
| Wooden discs (from lid)              | 4                     | 4                        | Door stops                       |


## Linear Components

### BrailleRAP
| Item                                 | Quantity  | **Ref** / Note                   |
| ------------------------------------ | --------- | ---------------------------------|
| Linear shafts Ø8mm, 330mm            | 4         | BrailleRAP carriages             |
| Linear shafts Ø8mm, 364mm            | 1         | BrailleRAP Y axis                |
| Linear shafts Ø8mm, 100mm            | 1         | Vertical axis                    |
| IGUS linear bearings                 | 6         | **RJ4JP-01-08** for carriages    |
| KP08 bearings                        | 2         | **KP08** for Vertical axis       |
| KFL8 bearings                        | 2         | **KFL8** for Y axis              |

### BrailleRAP XL
| Item                                 | Quantity  | **Ref** / Note                   |
| ------------------------------------ | --------- | ---------------------------------|
| Linear shafts Ø8mm, 470mm            | 4         | BrailleRAP XL carriages          |
| Linear shafts Ø8mm, 505mm            | 1         | BrailleRAP XL Y axis             |
| Linear shafts Ø8mm, 100mm            | 1         | Vertical axis                    |
| IGUS linear bearings                 | 6         | **RJ4JP-01-08** for carriages    |
| KP08 bearings                        | 2         | **KP08** for Vertical axis           |
| KFL8 bearings                        | 2         | **KFL8** for Y axis                  |


## Motion Components

### BrailleRAP
| Item                                 | Quantity  | **Ref** / Note                   |
| ------------------------------------ | --------- | ---------------------------------|
| GT2 belts, ±620mm                    | 2         | **GT2 6mm width** Carriage belts |
| GT2 belt tensioning springs          | 3         | Paper hold-down                  |
| GT2 belt, 200mm closed               | 1         | **GT2 6mm width closed** Y axis  |
| GT2 pulleys, 20 teeth, 5mm bore      | 1         | Y motor                          |
| GT2 pulleys, 20 teeth, 8mm bore      | 3         | Vertical & Y axis                |
| GT2 free pulleys, 20 teeth, 3mm bore | 2         | Free pulleys with bearing        |
| 5x8mm coupler                        | 1         | Motor coupling                   |

### BrailleRAP XL
| Item                                 | Quantity  | **Ref** / Note                       |
| ------------------------------------ | --------- | ---------------------------------|
| GT2 belts, ±960mm                    | 2         | **GT2 6mm width** XL Carriage belts           |
| GT2 belt tensioning springs          | 4         | Paper hold-down                  |
| GT2 belt, 200mm closed               | 1         | **GT2 6mm width closed** Y axis  |
| GT2 pulleys, 20 teeth, 5mm bore      | 1         | Y motor                          |
| GT2 pulleys, 20 teeth, 8mm bore      | 3         | Vertical & Y axis                |
| GT2 free pulleys, 20 teeth, 3mm bore | 2         | Free pulleys with bearing        |
| 5x8mm coupler                        | 1         | Motor coupling                   |

## Electronics

### BrailleRAP and BrailleRAP XL
| Item                                 | Quantity  | **Ref** / Note                       |
| ------------------------------------ | --------- | ---------------------------------|
| Nema 17 stepper motors               | 2         | **17HS4401** X & Y motors        |
| Solenoid                             | 1         | **TAU 826B 12V 2A** Braille stylus      |
| Wired limit switches                 | 2         | **OMRON SS-5GL (or compatible)**  X & Y endstops                   |
| MKS GEN 1.4 or GEN-L V2.1 board      | 1         | Controller                       |
| DRV8825 drivers                      | 2         | **8825** Motor drivers           |
| Jumpers                              | 6         | Driver configuration             |
| Motor cables (4-pin to 6-pin)        | 2         | Motor connections                |
| 18mm spacer                          | 1         | Solenoid / Braille stylus assembly                |
| 1N4004 Free wheel diode              | 1         | For MKS 1.4 only                  |

## Miscellaneous

### BrailleRAP
| Item                                 | Quantity  | **Ref** / Note                       |
| ------------------------------------ | --------- | ------------------------------------ |
| O-rings                              | 3         | Paper rollers                        |
| Cable ties 2.5 x 160                 | 10        | Bearing retention & Belt attachment  |

### BrailleRAP XL
| Item                                 | Quantity  | **Ref** / Note                       |
| ------------------------------------ | --------- | ------------------------------------ |
| O-rings                              | 4         | Paper rollers  ID 15.1 x OD 20.5 x 2.7     |
| Cable ties 2.5 x 160                 | 10        | Bearing retention & Belt attachment  |



## Notes on Controller board
This documentation explain how to use Arduino MEGA 2560 + RAMPS compatible board. As arduino Mega + Ramps is not recommended due to the overall thickness of the mount, equivalent board from MKS fit well and we provide a firmware for :
- MKS GEN 1.4 Board (Mega2560) + 2 DRV8825 drivers  https://github.com/makerbase-mks
- MKS GEN-L 1.0 or 1.2 Board (Mega2560) +  2 DRV8825 drivers  https://github.com/makerbase-mks

The firmware is based on Marlin Firmware and can be compiled and uploaded with Arduino software. The firmware is located in the **MarlinBraille** directory of the BrailleRAP project.


There is also some experiment with the 32 bits board from MKS.
- MKS TinyBee Board (ESP32) + 2 TMC2209 drivers  https://github.com/makerbase-mks

I won't recommend this board unless you are aware of building a Marlin2 firmware with VS-CODE and platform.io. Many dependencies are evolving often with some breaking change. Solving this kind of issues need good C/C++ skill.

## Notes on O-Ring
The O-Ring need to stick hard on the 3d printed part so it need some **elasticity**.
We have the best result with silicone O-Ring, Outer diameter 20mm, inner diameter 15mm, section 3mm.
You can also use use metric standard nitril 15.1 x 20.5 x 2.7 with success. 


