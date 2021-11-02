include zephyr-sample.inc

ZEPHYR_SRC_DIR = "${S}/samples/subsys/display/lvgl"
ZEPHYR_MODULES:append = "\;${S}/modules/lib/gui/lvgl"
