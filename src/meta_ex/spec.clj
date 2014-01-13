(ns meta-ex.spec
  (:require [overtone.live :as o]
            [shadertone.tone :as t]))

(t/start "shaders/spectrograph.glsl"
         :title "Shadertone Spectrograph"
         :width 1024 :height 512
         ;; this puts the FFT data in iChannel0 and a texture of the
         ;; previous frame in iChannel1
         :textures [:overtone-audio :previous-frame])

;; check out live microphone input
;; (o/definst external [] (o/sound-in 0))

;; (external)
;; (o/stop)

;; ;; try out some voice samples
;; (def sol-do   (o/sample (o/freesound-path 44929)))
;; (def sol-re   (o/sample (o/freesound-path 44934)))
;; (def sol-mi   (o/sample (o/freesound-path 44933)))

;; (sol-do)
;; (sol-re)
;; (sol-mi)

;; ;; testing precise frequencies
;; (o/definst sn [n 1] (o/sin-osc (* n 5.4)))
;; (sn 16)
;; (sn 128)
;; (sn 256)  ;; 2764.8
;; (sn 2048) ;; (* 5.4 2048) = 11k appears mid-screen
;; (o/stop)
