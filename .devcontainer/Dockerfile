FROM clojure:lein-2.10.0-focal

# Configure apt and install dev packages

ENV DEBIAN_FRONTEND=noninteractive
RUN apt-get update \
    && apt-get -y install --no-install-recommends apt-utils 2>&1
RUN apt-get -y install git procps lsb-release
RUN apt-get autoremove -y \
    && apt-get clean -y \
    && rm -rf /var/lib/apt/lists/*

ENV SHELL /bin/bash
