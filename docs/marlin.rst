Marlin Firmware pour cartes Ramps ou compatibles
================================================



.. Note:: Le firmware Marlin est utilisé pour contrôler l'embosseuse Braille. Nous utilisons la configuration CNC pour contrôler l'électro-aimant avec les commandes associées au moteur de CNC / stylo / laser (GCODE M3 et M4)


Configuration Marlin
--------------------

in configuration.h

Motherboard configuration ::

   #ifndef MOTHERBOARD
     //#define MOTHERBOARD BOARD_RAMPS_14_EFB
     #define MOTHERBOARD BOARD_RAMPS_14_SF
   #endif

Spindle / laser / pen configuration ::

   // BRAILLE RAP CONFIG
   #define SPINDLE_LASER_ENABLE
   #define SPINDLE_LASER_ENABLE_PIN  RAMPS_D8_PIN      // !!! for BED MOSFET
   #define SPINDLE_LASER_PWM_PIN     RAMPS_D10_PIN     // !!! for E0 MOSFET
   #define SPINDLE_DIR_PIN           5                 // pin servo


Endstop configuration ::

   // Mechanical endstop with COM to ground and NC to Signal uses "false" here (most common setup).
   #define X_MIN_ENDSTOP_INVERTING false // set to true to invert the logic of the endstop.
   #define Y_MIN_ENDSTOP_INVERTING false // set to true to invert the logic of the endstop.
   #define Z_MIN_ENDSTOP_INVERTING false // set to true to invert the logic of the endstop.
   #define X_MAX_ENDSTOP_INVERTING false // set to true to invert the logic of the endstop.
   #define Y_MAX_ENDSTOP_INVERTING false // set to true to invert the logic of the endstop.
   #define Z_MAX_ENDSTOP_INVERTING false // set to true to invert the logic of the endstop.
   #define Z_MIN_PROBE_ENDSTOP_INVERTING false // set to true to invert the logic of the probe.


Motor step / mm ::

   #define DEFAULT_AXIS_STEPS_PER_UNIT   { 80, 46, 4000, 500 }

Max feedrate ::

   #define DEFAULT_MAX_FEEDRATE          { 300, 300, 5, 25 }

Acceleration ::

   #define DEFAULT_MAX_ACCELERATION      { 1500, 1500, 100, 10000 }

   #define DEFAULT_ACCELERATION          1500    // X, Y, Z and E acceleration for printing moves
   #define DEFAULT_RETRACT_ACCELERATION  1500    // E acceleration for retracts
   #define DEFAULT_TRAVEL_ACCELERATION   1500    // X, Y, Z acceleration for travel (non printing) moves

Jerk ::

   #define DEFAULT_XJERK                 5.0
   #define DEFAULT_YJERK                 5.0
   #define DEFAULT_ZJERK                 0.3
   #define DEFAULT_EJERK                 5.0

Dans la version présente sur le github du projet BrailleRap, d'autres fichiers ont été modifiés pour gérer l'alimentation du papier avec le fin de course de l'axe Y.
