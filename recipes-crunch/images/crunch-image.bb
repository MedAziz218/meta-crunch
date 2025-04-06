# meta-crunch/recipes-core/images/core-image-crunch-minimal.bb

DESCRIPTION = "Minimal Yocto Image for Crunch Custom Distro"
LICENSE = "CLOSED"

# Inherit from the core image recipe
require recipes-core/images/core-image-minimal.bb


# Add any extra packages if necessary, e.g., systemd
IMAGE_INSTALL:append = " systemd crunch crunch-service"

# Make sure systemd is initialized correctly