SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT" 
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=97904f8e9fd003725a5ed65cbb0dd5ec"

SRC_URI = "git://github.com/pri1311/crunch;protocol=https;branch=master"
SRCREV = "6a80aa45ab70bf20d0748c74e04c04ffd6b202d8"

S = "${WORKDIR}/git"

RDEPENDS:${PN} += "python3 python3-sqlite3 python3-bidict python3-certifi python3-click python3-click python3-cloudinary \
python3-flask python3-flask-login python3-flask-socketio python3-flask-sqlalchemy python3-itsdangerous python3-jinja2 \
python3-markupsafe python3-engineio python3-socketio python3-six python3-sqlalchemy python3-urllib3 python3-werkzeug python3-gunicorn"

RDEPENDS:${PN} += " python3-pip"

SRC_URI += " file://crunch-main-socketio-config.patch"


do_install(){
    echo "Installing the package..."
    install -d ${D}${datadir}/crunch
    cp -r ${S}/* ${D}${datadir}/crunch/    
}

# bidict==0.21.2
# certifi==2020.12.5
# click==7.1.2
# cloudinary==1.24.0
# Flask==1.1.2
# Flask-Login==0.5.0
# Flask-SocketIO==4.3.2
# Flask-SQLAlchemy==2.4.4
# itsdangerous==1.1.0
# Jinja2==2.11.3
# MarkupSafe==1.1.1
# python-engineio==3.14.2
# python-socketio==4.6.1
# six==1.15.0
# SQLAlchemy==1.3.23
# urllib3==1.26.4
# Werkzeug==1.0.1
# gunicorn==19.9.0