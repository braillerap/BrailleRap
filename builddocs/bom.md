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
----------------
Toutes les pièces sont imprimées en ABS, 50% de remplissage, 3 périmètres extérieurs. Nous utilisons le filament eSun ABS Natural.

The files for the 3d printer are available here : https://github.com/braillerap/BrailleRap/tree/master/printed_parts
 

| Item                                 | Quantity (BrailleRAP) | Quantity (BrailleRAP XL) | Notes                            |
| ------------------------------------ | --------------------- | ------------------------ | ---------------------------------|
| **Linear Components**                |                       |                          |
| Linear shafts Ø8mm, 100mm            | 1                     | 1                        | Vertical axis                    |
|                            | Linear shafts Ø8mm, 330mm            | 4                     | -                        | BrailleRAP carriages             |
|                            | Linear shafts Ø8mm, 364mm            | 1                     | -                        | BrailleRAP Y axis                |
|                            | Linear shafts Ø8mm, 470mm            | -                     | 4                        | BrailleRAP XL carriages          |
|                            | Linear shafts Ø8mm, 505mm            | -                     | 1                        | BrailleRAP XL Y axis             |
|                            | IGUS linear bearings                 | 6                     | 6                        | Carriage bearings                |
|                            | KP08 bearings                        | 2                     | 2                        | Vertical axis                    |
|                            | KFL8 bearings                        | 2                     | 2                        | Y axis                           |
| **Motion Components**      |                                      |                       |                          |                                  |
GT2 belts, ±620mm                    | 2                     | 1                        | Carriage belts                   |
|                            | GT2 belts, ±960mm                    | -                     | 1                        | XL bottom carriage               |
|                            | GT2 belt, 200mm closed               | 1                     | 1                        | Y axis                           |
|                            | GT2 pulleys, 20 teeth, 5mm bore      | 1                     | 1                        | Y motor                          |
|                            | GT2 pulleys, 20 teeth, 8mm bore      | 3                     | 3                        | Vertical & Y axis                |
|                            | GT2 free pulleys, 20 teeth, 3mm bore | 2                     | 2                        | Free pulleys                     |
|                            | 5x8mm coupler                        | 1                     | 1                        | Motor coupling                   |
|                            | GT2 belt tensioning springs          | 3                     | 4                        | Paper hold-down                  |
| **Electronics**            | Nema 17 stepper motors               | 2                     | 2                        | X & Y motors                     |
|                            | Solenoid                             | 1                     | 1                        | Braille stylus                   |
|                            | Wired limit switches                 | 2                     | 2                        | X & Y endstops                   |
|                            | MKS GEN 1.4 or GEN-L V2.1 board      | 1                     | 1                        | Controller                       |
|                            | DRV8825 drivers                      | 2                     | 2                        | Motor drivers                    |
|                            | Jumpers                              | 6                     | 6                        | Driver configuration             |
|                            | Motor cables (4-pin to 6-pin)        | 2                     | 2                        | Motor connections                |
|                            | 18mm spacer                          | 1                     | 1                        | Solenoid assembly                |
| **3D Printed Parts**       | BOTTOM_AXIS_left2                    | 1                     | 1                        | Axis support                     |
|                            | TOP_AXIS_left2                       | 1                     | 1                        | Axis support                     |
|                            | TOP_AXIS_right2                      | 1                     | 1                        | Axis support                     |
|                            | BOTTOM_AXIS_right2                   | 1                     | 1                        | Axis support                     |
|                            | XMOTOR_support3                      | 1                     | 1                        | X motor mount                    |
|                            | XMOTOR_support3_1                    | 1                     | 1                        | X motor mount                    |
|                            | YMOTOR_support2_200 series           | 3                     | 3                        | Y motor mount parts              |
|                            | SWITCH_X_support                     | 1                     | 1                        | X limit switch                   |
|                            | ELECTRO_MAGNET_housing2(_fit)        | 1                     | 1                        | Solenoid housing                 |
|                            | DRIVEN_PULLEY_housing                | 2                     | 2                        | Belt tensioners                  |
|                            | BOTTOM_trolley                       | 1                     | 1                        | Bottom carriage                  |
|                            | TOP_trolley                          | 1                     | 1                        | Top carriage                     |
|                            | FEMALE_shape                         | 1                     | 1                        | Braille die                      |
|                            | ROLL_joint3                          | 3                     | 4                        | Paper rollers                    |
|                            | clipboard2_support                   | 3                     | 4                        | Paper hold-down                  |
|                            | clipboard2                           | 3                     | 4                        | Paper hold-down                  |
|                            | CLIPBOARD2_WHEEL                     | 3                     | 4                        | Paper hold-down                  |
|                            | KP08_support                         | 2                     | 2                        | Vertical axis                    |
|                            | PAPER_GUIDE_left                     | 1                     | -                        | BrailleRAP paper guide           |
|                            | PAPER_GUIDE_right                    | 1                     | -                        | BrailleRAP paper guide           |
|                            | paper_guide_left_XL                  | -                     | 1                        | BrailleRAP XL paper guide        |
|                            | paper_guide_right_XL                 | -                     | 1                        | BrailleRAP XL paper guide        |
|                            | ENDSTOP_Y_support                    | 1                     | 1                        | Y limit switch                   |
|                            | ENDSTOP_Y_lever_weight               | 1                     | 1                        | Y limit switch                   |
|                            | LID_LOCK                             | 2                     | 2                        | Lid clips                        |
|                            | POWER_plate                          | 1                     | 1                        | Power supply mount               |
|                            | DOORLOCKER                           | 2                     | 2                        | Rear panel lock                  |
|                            | ELECTRO_MAGNET_guide_fitxxx          | 1                     | 1                        | Solenoid guide (select best fit) |
| **Laser Cut Parts**        | FACE (5mm plywood)                   | 1                     | 1                        | Enclosure                        |
|                            | BACK (5mm plywood)                   | 1                     | 1                        | Enclosure                        |
|                            | BOTTOM (5mm plywood)                 | 1                     | 1                        | Enclosure                        |
|                            | LEFT_SIDE (5mm plywood)              | 1                     | 1                        | Enclosure                        |
|                            | RIGHT_SIDE (5mm plywood)             | 1                     | 1                        | Enclosure                        |
|                            | PAPER_support (5mm plywood)          | 1                     | 1                        | Paper tray                       |
|                            | Upper paper support                  | 1                     | 1                        | Paper tray                       |
|                            | Lower paper support                  | 1                     | 1                        | Paper tray                       |
|                            | Wooden discs (from lid)              | 4                     | 4                        | Door stops                       |
| **Miscellaneous**          | O-rings                              | 3                     | 4                        | Paper rollers                    |
|                            | Cable ties 2.5 x 160                 | 6                     | 6                        | Bearing retention                |
|                            | Cable ties                           | 4                     | 4                        | Belt attachment                  |
|                            | Whetstone                            | 1                     | 1                        | Stylus preparation               |
|                            | Wood glue                            | 1                     | 1                        | Assembly                         |
|                            | Blue painter's tape                  | 1                     | 1                        | Assembly                         |
|                            | Clamping pliers                      | 1                     | 1                        | Assembly                         |


Pièces mécaniques
-----------------

Pour BrailleRAP
<<<<<<<<<<<<<<<

=== =========================================
Qty Type
=== =========================================
4   Rail de guidage linéaire ( diamètre 8mm ) **330 mm** length
1   Rail de guidage linéaire ( diamètre 8mm ) **365 mm** length
1   Rail de guidage linéaire ( diamètre 8mm ) **100 mm** length

2   630 mm de courroie GT2

3   Joints torique 15.1 mm diamètre intérieur 20.5 mm de diamètre extérieur (15.1 x 20.5 x 2.7)
3   Ressorts tendeurs de courroie GT2

...
=== =========================================
 

Pour BrailleRAP XL
<<<<<<<<<<<<<<<<<<

=== =========================================
Qty Type
=== =========================================
4   Rail de guidage linéaire ( diamètre 8mm ) **470 mm** length
1   Rail de guidage linéaire ( diamètre 8mm ) **505 mm** length
1   Rail de guidage linéaire ( diamètre 8mm ) **100 mm** length

2   960 mm de courroie GT2

4   Joints torique 15.1 mm diamètre intérieur 20.5 mm de diamètre extérieur (15.1 x 20.5 x 2.7)
4   Ressorts tendeurs de courroie GT2
...
=== =========================================


Pièces communes BrailleRAP XL / BrailleRAP
<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

=== =========================================
Qty Type
=== =========================================
6   RJ4JP-01-08 palier linéaire Polymer  

3   GT2 poulie 20 dents pour axe 8mm    
2   GT2 poulie libre 20 dents axe 3mm (avec roulement à billes)
1   GT2 poulie 20 dents pour axe 5mm

2   KP08  pallier horizontal pour rail linéaire 8mm 
2   KFL08 pallier vertical pour rail linéaire 8mm 

1   Accouplement d'axe 5mm/8mm

1   Courroie GT2 fermée 200 mm

10	Colliers de serrage 2.5 x 160 mm

...
=== =========================================


Carte controleur
----------------
En fonction de vos souhaits vous pouvez utiliser au choix :

- Une carte MKS GEN 1.4 (Mega2560) et 2 drivers DRV8825 https://github.com/makerbase-mks
- Une carte MKS GEN-L (Mega2560) et 2 drivers DRV8825 https://github.com/makerbase-mks
- Une carte MKS TinyBee (ESP32) et 2 drivers TMC2209 https://github.com/makerbase-mks

D'autres configuration sont possibles, mais vous devrez effectuer la configuration du firmware vous même


Electronique
------------

=== ===========================================================================================
Qty Type
=== ===========================================================================================
2   Moteurs Nema 17 40 N/cm 40mm avec câble (17HS4401).        
1   Electro-aimant *tau-826b* 12V 2A.
1   MKS GEN 1.4 ou carte compatible Ramps 1.4 ou MKS GEN L 2.1 https://github.com/makerbase-mks.
2   drivers DRV8825 avec radiateur.
1   1N4004  diode de roue libre ou equivalent (12V 2A) (pour MKS GEN 1.4 uniquement).    
2   Commutateurs fin de course cablés conformément à la documentation. (OMRON `SS-5GL <https://omronfs.omron.com/en_US/ecb/products/pdf/en-ss.pdf>`_ ou compatible)
1   Embase Alimentation jack 2.5mm. 
1   Alimentation 12v 6A jack 2.5mm.

=== ===========================================================================================



