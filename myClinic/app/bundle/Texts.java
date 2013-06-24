package bundle;

import java.util.ListResourceBundle;

public class Texts extends ListResourceBundle{
	
	String [][] texts = new String[][]{
			{"save","‌ذخیره"},	
			{"cancel","لغو"},
			
//personal
			{"id","ای دی"},
			{"identitiesPerson","مشخصات شخص"},
			{"nameFather","نام پدر"},
			{"proficiency","تخصص"},
			{"job","وظیفه"},
			{"phone","تلفن"},
			{"readyActivity","اماده فعالیت"},
			{"address","ادرس"},
			{"salaryPercentage","معاش، فیصدی"},
			{"salaryContracted","معاش، قراردادی"},
			{"photo","عکس"},
			{"formRegistrationPersonal","فرم راجستر کارمندان"},
			{"listPersonal","لیست کارمندان"},
			{"yes","بله"},
			{"no","خیر"},
			{"nic","شماره تذکیره"},
//reception
			{"dateVisit","تاریخ مراجعه"},
			{"doctorTherapeutic","داکتر معالج"},
			{"idDoctor","ای دی داکتر"},	
			{"costVisit","حق وزیت"},
			{"situationPayment","وضعیت تصویه"},
			{"formRegistrationPatient","فرم راجستر بیمار"},
			{"listPatientsRegistrationEd","لیست بیماران راجستر شده"},
			{"paid","پرداخت شده"},
			{"unpaid","پرداخت نشده"},
			{"recieptVisitDoctor","قبض وزیت داکتر"},
			{"print","چاپ"},
			{"ambulance","آمبولانس"},
			{"child"," اطفال"},
			{"in","داخله"},
			{"dentist","دندان"},
			{"ear","گوش و گلو"},
			{"neurotic"," عصبی"},
//home
			{"clinicManagementSystem","نرم افزار مدیریت کلینیک و مراکز درمانی،ابنوس"},
			{"mainPage","صفحه اصلی"},
			{"drugStore","داروخانه"},
			{"parturition&operation","نسای و عملیات"},
			{"bed","بستر"},
			{"lab","آزمایشگاه"},
			{"accounting","حساب داری"},
			{"office","اداره"},
			{"reception","پذیرش"},
			{"cannotBeEmpty","خالی بوده  نمی تواند"},
			{"parturition","نسایی ولادی"},
			{"operation","عملیات"},
			
//beds
			{"formRegistrationBed","فرم راجستر بستر"},
			{"listBedsRegistrationEd","لیست بسترهای راجستر شده"},
			{"QodcPrivateClinic","کلینیک خصوصی قدس"},
			{"listBedsReserved","لیست بسترهای رزرو شده"},
			{"action","اکشن"},
			{"dateFinish","تاریخ ختم"},
			{"dateStart","تاریخ شروع"},
			{"cost","هزینه"},
			{"department","بخش"},
			{"numberBed","شماره بستر"},
			{"numberRegistration","شماره راجستر"},
			{"reservedCheck","قبض بستر رزرو شده"},
//drugstor
			{"numberOrder","شماره"},
			{"price","قیمت"},
			{"advantageFromSelling","مفاد از فروش"},
			{"priceTotalSelling","قیمت کل فروش"},
			{"dateSelling","تاریخ فروش"},
			{"numberPrescription","شماره نسخه"},
			{"rank","ردیف"},
			{"priceSelling","قیمت فروش"},
			{"priceBuying","قیمت خرید"},
			{"made","ساخت"},
			{"nameDrug","نام دارو"},
			{"selling","فروش"},
			{"notationDrug","ثبت دارو"},
			{"listSelling","لیست فروش"},
			{"numberNotation","شماره ثبت"},
			{"listDrug","لیست داروها"},
			{"name-cost-made","نام-قیمت-ساخت"},
			{"tedad","تعداد"},
			{"sumTotal","جمع کل"},
//user
			{"nameUser","نام کاربر"},
			{"lastNameUser","تخلص کاربر"},
			{"allowAccessibility","اجازه دسترسی"},
			{"pleaseWriteHere","لطفا اینجا بنویسید"},
			{"formCreateUser","فرم ایجاد کاربر"},
			{"passwordUser","رمز کاربر"},
			{"edit","ویرایش"},
			{"id","شماره مسلسل"},
			{"bedAccess","بستر"},
			{"labAccess","آزمایشگاه"},
			{"receptionAccess","پذیرش"},
			{"accountingAccess","حسابداری"},
			{"timeReservingAccess","رزرو وقت"},
			{"officeAccess","اداره"},
			{"ambulanceAccess","آمبولانس"},
			{"createUserAccess","ایجاد کاربر"},
			{"operationAccess","عملیات"},
			{"drugStoreAccess","دواخانه"},
			{"usersList","لیست کاربران"},
			
//parturition
			{"name","نام"},
			{"lastName","نام خانوادگی"},
			{"dateBirth","تاریخ حمل"},
			{"numberBirth","تعداد حمل"},
			{"doctor","داکتر"},
			{"groupBlood","گروپ خون"},
			{"explanation","توضیحات"},
			{"discount","تخفیف"},
			{"operated","عملیات شده"},
			{"formParturition","فرم راجستر نسای "},
			{"listDepartmentParturition","لیست بخش نسای"},
			{"formRegistrationOperation","فرم راجستر عملیات"},
			{"listDepartmentOperation","لیست بخش عملیات"},
			{"sezarian","سزارین"},
//operation
			{"doctorOperation","داکتر عملیات"},
			{"assistantOperation","دستیار عملیات"},
			{"kindOperation","نوع عملیات"},
			{"succeed","موفقانه"},
			{"operationSucceed","عملیات موفقانه"},
			{"foreFather","جد"},
			{"age","سن"},
			{"operationDate","تاریخ عملیات"},
			{"discount","تخفیف"},
//ambulance
			{"recieptAmbulanceRequested","قبض امبولانس در خواستی"},
			{"numberAmbulance","شماره امبولانس"},
			{"nameCaller","نام تماس گیرنده"},
			{"phoneCaller","شماره تماس گیرنده"},
			{"dateCalled","تاریخ تماس"},
			{"listCallingRequestAmbulance","لیست تماس های درخواستی امبولانس"},
			{"registerCallNew","راجستر تماس جدید"},
			{"listCallRequested","لیست تماس های درخواستی"}
			
	};

	@Override
	protected Object[][] getContents() {
		return texts;
	}

}
