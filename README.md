# Yocto Layer for Crunch Chat Server

This Yocto project is a practical exercise based on a challenge shared in the Techleef Discord channel.  
The goal is to create a custom Yocto layer and image that integrates the [Crunch Flask Chat Server](https://github.com/pri1311/crunch).

---

## 📌 Project Goal

Develop a Yocto layer that:

- Defines a custom distro using `systemd` as the init manager.
- Builds an image that includes:
  - The [Crunch](https://github.com/pri1311/crunch) Flask-based chat server.
  - All necessary Python dependencies.
  - A systemd service that starts the chat server automatically on boot.

---

## 📂 Layer Overview: `meta-crunch`

- **`crunchdistro/`**  
  Custom distro configuration using `systemd`.

- **`crunch-image/`**  
  A minimal image based on `crunchdistro`. Installs `crunch` and configures a systemd service to launch it at boot.

- **`crunch-service/`**  
  Provides a `systemd` unit to run the Crunch server as a service.

- **`crunch/`**  
  BitBake recipe to fetch and install the Crunch chat server from source.

- **`python-deps/`**  
  Contains recipes for Python dependencies not available in `meta-python`, or where a specific version is needed (via `.bbappend`).

---

## 📦 Layer Dependencies

This layer depends on:

- [`meta-python`](https://layers.openembedded.org/layerindex/branch/master/layer/meta-python/)

---

## ⚙️ How to Use

1. **Clone this layer:**

   bash
   git clone https://github.com/YOUR_USERNAME/meta-crunch.git
   

2. **Add it to your Yocto build:**

   bash
   bitbake-layers add-layer path/to/meta-crunch
   

3. **Configure your build:**

   In `conf/local.conf`:
   ```
   conf
   DISTRO = "crunchdistro"
   MACHINE = "qemux86-64"
   ```

4. **Build the image:**

   ```bash
   bitbake crunch-image
   ```

---

## 🧪 Tested Configuration

- ✅ `MACHINE = "qemux86-64"`

---

## 🙌 Credits

Big thanks to [@bhstalel](https://github.com/bhstalel) for his awesome Yocto tutorials.  
Join the [Techleef Discord](https://discord.gg/AvTWEtJkQ9) for more hands-on learning.

---

## 📝 License

This project is for educational purposes. Use freely for any purpose.