# Yemek Sipariş Uygulaması

Bu proje, kullanıcılara çeşitli yemek kategorileri arasında gezinme, en iyi yemekleri görüntüleme ve ayrıntılarını inceleme imkanı sunan bir yemek sipariş uygulamasıdır.

## Özellikler

- Kayıt ve Giriş yapma
- Kategorilere göre yemekleri görüntüleme
- En iyi yemekleri listeleme
- Yemek ayrıntılarını inceleme
- Firebase Realtime Database ile veri yönetimi
- Glide kütüphanesi ile görsel yükleme

## Ekran Görüntüleri

![Kayıt Ekranı](https://github.com/emrecankarli/EmrET/assets/156820008/fbdcac64-a704-4023-b948-6ba14edb4bae)
![Ana Sayfa](https://github.com/emrecankarli/EmrET/assets/156820008/935e5087-f5ad-4fcf-b3aa-4b69fc8bec77)
![Yemek Detay Ekranı](https://github.com/emrecankarli/EmrET/assets/156820008/e6175346-e08d-40f7-867c-54e990e1cba2)
![Sepet Ekranı](https://github.com/emrecankarli/EmrET/assets/156820008/eb48f4b0-e9ad-41a4-a3a9-a86168aa069e)

## Gereksinimler

- Android Studio 4.0 veya üzeri
- Min SDK: 21
- İnternet bağlantısı (Firebase bağlantısı için)

## Kurulum

Projeyi klonlayın:

```bash
git clone https://github.com/kullaniciadi/yemek-siparis-uygulamasi.git
```

Android Studio ile projeyi açın ve gerekli bağımlılıkların yüklenmesini bekleyin.

## Kullanım
Uygulamayı Android Studio'da çalıştırın.
Kategorilere tıklayarak yemekleri görüntüleyin.
Yemeklerin detaylarına ulaşmak için listeden bir yemeğe tıklayın.

## Firebase Yapılandırması
Firebase Realtime Database'i kullanabilmek için aşağıdaki adımları izleyin:

Firebase Console üzerinden yeni bir proje oluşturun.
Uygulamayı Firebase'e ekleyin ve google-services.json dosyasını indirin.
google-services.json dosyasını projenizin app dizinine ekleyin.

## Katkıda bulunmak için:

Bu projeyi fork edin.
Yeni bir dal (branch) oluşturun: git checkout -b ozellik/yeniozellik
Değişikliklerinizi commit edin: git commit -am 'Yeni özelliği ekledim'
Dalınıza push edin: git push origin ozellik/yeniozellik
Bir pull request oluşturun.

## Lisans
Bu proje MIT Lisansı ile lisanslanmıştır. Daha fazla bilgi için LICENSE dosyasına bakın.
