## Bill of Material - Electronics

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

## Bill of Material - Miscellaneous

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