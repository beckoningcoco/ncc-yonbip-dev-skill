# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7431.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_voucherentry | pk_voucherentry | pk_voucherentry | char(20) | √ |
| 2 | breworkflag | breworkflag | breworkflag | char(1) |
| 3 | ccustomerid | ccustomerid | ccustomerid | varchar2(20) |  |  | '~' |
| 4 | cmarcostclassid | cmarcostclassid | cmarcostclassid | varchar2(20) |  |  | '~' |
| 5 | cmaterialid | cmaterialid | cmaterialid | varchar2(20) |  |  | '~' |
| 6 | cmaterialvid | cmaterialvid | cmaterialvid | varchar2(20) |  |  | '~' |
| 7 | corpcom | corpcom | corpcom | varchar2(20) |  |  | '~' |
| 8 | costobject | costobject | costobject | varchar2(50) |
| 9 | costobjecttype | costobjecttype | costobjecttype | number(38, 0) |
| 10 | costregion | costregion | costregion | varchar2(20) |  |  | '~' |
| 11 | cproductorid | cproductorid | cproductorid | varchar2(20) |  |  | '~' |
| 12 | cprojectid | cprojectid | cprojectid | varchar2(20) |  |  | '~' |
| 13 | crcid | crcid | crcid | varchar2(20) |  |  | '~' |
| 14 | creditbookamont | creditbookamont | creditbookamont | number(28, 8) |  |  | 0 |
| 15 | creditcount | creditcount | creditcount | number(28, 8) |
| 16 | creditglamount | creditglamount | creditglamount | number(28, 8) |  |  | 0 |
| 17 | creditgllamount | creditgllamount | creditgllamount | number(28, 8) |  |  | 0 |
| 18 | creditoriamount | creditoriamount | creditoriamount | number(28, 8) |  |  | 0 |
| 19 | cvendorid | cvendorid | cvendorid | varchar2(20) |  |  | '~' |
| 20 | debitbookamount | debitbookamount | debitbookamount | number(28, 8) |  |  | 0 |
| 21 | debitcount | debitcount | debitcount | number(28, 8) |
| 22 | debitglamount | debitglamount | debitglamount | number(28, 8) |  |  | 0 |
| 23 | debitgllamount | debitgllamount | debitgllamount | number(28, 8) |  |  | 0 |
| 24 | debitoriamount | debitoriamount | debitoriamount | number(28, 8) |  |  | 0 |
| 25 | digest | digest | digest | varchar2(300) |  |  | '~' |
| 26 | entryno | entryno | entryno | varchar2(50) |
| 27 | fcalcthreadbizflag | fcalcthreadbizflag | fcalcthreadbizflag | number(38, 0) |
| 28 | fdatagetflag | fdatagetflag | fdatagetflag | number(38, 0) |
| 29 | financeorg | financeorg | financeorg | varchar2(20) |  |  | '~' |
| 30 | gllrate | gllrate | gllrate | number(28, 8) |
| 31 | glrate | glrate | glrate | number(28, 8) |
| 32 | lobookrate | lobookrate | lobookrate | number(28, 8) |
| 33 | mainfree1 | mainfree1 | mainfree1 | varchar2(101) |
| 34 | mainfree2 | mainfree2 | mainfree2 | varchar2(101) |
| 35 | mainfree3 | mainfree3 | mainfree3 | varchar2(101) |
| 36 | mainfree4 | mainfree4 | mainfree4 | varchar2(101) |
| 37 | mainfree5 | mainfree5 | mainfree5 | varchar2(101) |
| 38 | mainfree6 | mainfree6 | mainfree6 | varchar2(101) |
| 39 | mainfree7 | mainfree7 | mainfree7 | varchar2(101) |
| 40 | mainfree8 | mainfree8 | mainfree8 | varchar2(101) |
| 41 | mainfree9 | mainfree9 | mainfree9 | varchar2(101) |
| 42 | mainfree10 | mainfree10 | mainfree10 | varchar2(101) |
| 43 | mainpclient | mainpclient | mainpclient | varchar2(20) |  |  | '~' |
| 44 | mainpitem | mainpitem | mainpitem | varchar2(20) |  |  | '~' |
| 45 | mainpmanufacturer | mainpmanufacturer | mainpmanufacturer | varchar2(20) |  |  | '~' |
| 46 | mainpsupplier | mainpsupplier | mainpsupplier | varchar2(20) |  |  | '~' |
| 47 | materials | materials | materials | varchar2(20) |  |  | '~' |
| 48 | mcostobject | mcostobject | mcostobject | varchar2(50) |
| 49 | measureunit | measureunit | measureunit | varchar2(20) |  |  | '~' |
| 50 | mfree1 | mfree1 | mfree1 | varchar2(101) |
| 51 | mfree2 | mfree2 | mfree2 | varchar2(101) |
| 52 | mfree3 | mfree3 | mfree3 | varchar2(101) |
| 53 | mfree4 | mfree4 | mfree4 | varchar2(101) |
| 54 | mfree5 | mfree5 | mfree5 | varchar2(101) |
| 55 | mfree6 | mfree6 | mfree6 | varchar2(101) |
| 56 | mfree7 | mfree7 | mfree7 | varchar2(101) |
| 57 | mfree8 | mfree8 | mfree8 | varchar2(101) |
| 58 | mfree9 | mfree9 | mfree9 | varchar2(101) |
| 59 | mfree10 | mfree10 | mfree10 | varchar2(101) |
| 60 | mpclient | mpclient | mpclient | varchar2(20) |  |  | '~' |
| 61 | mpitem | mpitem | mpitem | varchar2(20) |  |  | '~' |
| 62 | mpmanufacturer | mpmanufacturer | mpmanufacturer | varchar2(20) |  |  | '~' |
| 63 | mproduct | mproduct | mproduct | varchar2(20) |  |  | '~' |
| 64 | mpstoretype | mpstoretype | mpstoretype | varchar2(20) |  |  | '~' |
| 65 | mpsupplier | mpsupplier | mpsupplier | varchar2(20) |  |  | '~' |
| 66 | mstoretype | mstoretype | mstoretype | varchar2(20) |  |  | '~' |
| 67 | opaccount | opaccount | opaccount | varchar2(20) |  |  | '~' |
| 68 | pk_client | pk_client | pk_client | varchar2(20) |  |  | '~' |
| 69 | pk_costcenter | pk_costcenter | pk_costcenter | varchar2(20) |  |  | '~' |
| 70 | pk_costvoucher | pk_costvoucher | pk_costvoucher | char(20) | √ |
| 71 | pk_csrcb | pk_csrcb | pk_csrcb | varchar2(50) |
| 72 | pk_dimsgroup | pk_dimsgroup | pk_dimsgroup | varchar2(50) |  |  | '~' |
| 73 | pk_factor | pk_factor | pk_factor | varchar2(20) |  |  | '~' |
| 74 | pk_glcurrtype | pk_glcurrtype | pk_glcurrtype | varchar2(20) |  |  | '~' |
| 75 | pk_gllcurrtype | pk_gllcurrtype | pk_gllcurrtype | varchar2(20) |  |  | '~' |
| 76 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 77 | pk_gsubject | pk_gsubject | pk_gsubject | varchar2(20) |  |  | '~' |
| 78 | pk_ksubject | pk_ksubject | pk_ksubject | varchar2(20) |  |  | '~' |
| 79 | pk_lobookcur | pk_lobookcur | pk_lobookcur | varchar2(20) |  |  | '~' |
| 80 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 81 | pk_originalcur | pk_originalcur | pk_originalcur | varchar2(20) |  |  | '~' |
| 82 | pk_supplier | pk_supplier | pk_supplier | varchar2(20) |  |  | '~' |
| 83 | producttype | producttype | producttype | number(38, 0) |
| 84 | profitcenter | profitcenter | profitcenter | varchar2(20) |  |  | '~' |
| 85 | pstoretype | pstoretype | pstoretype | varchar2(20) |  |  | '~' |
| 86 | remark | remark | remark | varchar2(200) |
| 87 | specialfiles | specialfiles | specialfiles | varchar2(20) |  |  | '~' |
| 88 | storetype | storetype | storetype | number(38, 0) |
| 89 | task | task | task | varchar2(20) |  |  | '~' |
| 90 | unitprice | unitprice | unitprice | number(28, 8) |
| 91 | vmocode | vmocode | vmocode | varchar2(50) |
| 92 | vmotype | vmotype | vmotype | number(38, 0) |
| 93 | vrowno | vrowno | vrowno | varchar2(20) |
| 94 | vsrcrowno | vsrcrowno | vsrcrowno | varchar2(50) |
| 95 | def1 | def1 | def1 | varchar2(101) |
| 96 | def2 | def2 | def2 | varchar2(101) |
| 97 | def3 | def3 | def3 | varchar2(101) |
| 98 | def4 | def4 | def4 | varchar2(101) |
| 99 | def5 | def5 | def5 | varchar2(101) |
| 100 | def6 | def6 | def6 | varchar2(101) |
| 101 | def7 | def7 | def7 | varchar2(101) |
| 102 | def8 | def8 | def8 | varchar2(101) |
| 103 | def9 | def9 | def9 | varchar2(101) |
| 104 | def10 | def10 | def10 | varchar2(101) |
| 105 | def11 | def11 | def11 | varchar2(101) |
| 106 | def12 | def12 | def12 | varchar2(101) |
| 107 | def13 | def13 | def13 | varchar2(101) |
| 108 | def14 | def14 | def14 | varchar2(101) |
| 109 | def15 | def15 | def15 | varchar2(101) |
| 110 | def16 | def16 | def16 | varchar2(101) |
| 111 | def17 | def17 | def17 | varchar2(101) |
| 112 | def18 | def18 | def18 | varchar2(101) |
| 113 | def19 | def19 | def19 | varchar2(101) |
| 114 | def20 | def20 | def20 | varchar2(101) |
| 115 | def21 | def21 | def21 | varchar2(101) |
| 116 | def22 | def22 | def22 | varchar2(101) |
| 117 | def23 | def23 | def23 | varchar2(101) |
| 118 | def24 | def24 | def24 | varchar2(101) |
| 119 | def25 | def25 | def25 | varchar2(101) |
| 120 | def26 | def26 | def26 | varchar2(101) |
| 121 | def27 | def27 | def27 | varchar2(101) |
| 122 | def28 | def28 | def28 | varchar2(101) |
| 123 | def29 | def29 | def29 | varchar2(101) |
| 124 | def30 | def30 | def30 | varchar2(101) |
| 125 | def31 | def31 | def31 | varchar2(101) |
| 126 | def32 | def32 | def32 | varchar2(101) |
| 127 | def33 | def33 | def33 | varchar2(101) |
| 128 | def34 | def34 | def34 | varchar2(101) |
| 129 | def35 | def35 | def35 | varchar2(101) |
| 130 | def36 | def36 | def36 | varchar2(101) |
| 131 | def37 | def37 | def37 | varchar2(101) |
| 132 | def38 | def38 | def38 | varchar2(101) |
| 133 | def39 | def39 | def39 | varchar2(101) |
| 134 | def40 | def40 | def40 | varchar2(101) |
| 135 | def41 | def41 | def41 | varchar2(101) |
| 136 | def42 | def42 | def42 | varchar2(101) |
| 137 | def43 | def43 | def43 | varchar2(101) |
| 138 | def44 | def44 | def44 | varchar2(101) |
| 139 | def45 | def45 | def45 | varchar2(101) |
| 140 | def46 | def46 | def46 | varchar2(101) |
| 141 | def47 | def47 | def47 | varchar2(101) |
| 142 | def48 | def48 | def48 | varchar2(101) |
| 143 | def49 | def49 | def49 | varchar2(101) |
| 144 | def50 | def50 | def50 | varchar2(101) |
| 145 | def51 | def51 | def51 | varchar2(101) |
| 146 | def52 | def52 | def52 | varchar2(101) |
| 147 | def53 | def53 | def53 | varchar2(101) |
| 148 | def54 | def54 | def54 | varchar2(101) |
| 149 | def55 | def55 | def55 | varchar2(101) |
| 150 | def56 | def56 | def56 | varchar2(101) |
| 151 | def57 | def57 | def57 | varchar2(101) |
| 152 | def58 | def58 | def58 | varchar2(101) |
| 153 | def59 | def59 | def59 | varchar2(101) |
| 154 | def60 | def60 | def60 | varchar2(101) |
| 155 | def61 | def61 | def61 | varchar2(101) |
| 156 | def62 | def62 | def62 | varchar2(101) |
| 157 | def63 | def63 | def63 | varchar2(101) |
| 158 | def64 | def64 | def64 | varchar2(101) |
| 159 | def65 | def65 | def65 | varchar2(101) |
| 160 | def66 | def66 | def66 | varchar2(101) |
| 161 | def67 | def67 | def67 | varchar2(101) |
| 162 | def68 | def68 | def68 | varchar2(101) |
| 163 | def69 | def69 | def69 | varchar2(101) |
| 164 | def70 | def70 | def70 | varchar2(101) |
| 165 | def71 | def71 | def71 | varchar2(101) |
| 166 | def72 | def72 | def72 | varchar2(101) |
| 167 | def73 | def73 | def73 | varchar2(101) |
| 168 | def74 | def74 | def74 | varchar2(101) |
| 169 | def75 | def75 | def75 | varchar2(101) |
| 170 | def76 | def76 | def76 | varchar2(101) |
| 171 | def77 | def77 | def77 | varchar2(101) |
| 172 | def78 | def78 | def78 | varchar2(101) |
| 173 | def79 | def79 | def79 | varchar2(101) |
| 174 | def80 | def80 | def80 | varchar2(101) |
| 175 | vfree1 | vfree1 | vfree1 | varchar2(101) |
| 176 | vfree2 | vfree2 | vfree2 | varchar2(101) |
| 177 | vfree3 | vfree3 | vfree3 | varchar2(101) |
| 178 | vfree4 | vfree4 | vfree4 | varchar2(101) |
| 179 | vfree5 | vfree5 | vfree5 | varchar2(101) |
| 180 | vfree6 | vfree6 | vfree6 | varchar2(101) |
| 181 | vfree7 | vfree7 | vfree7 | varchar2(101) |
| 182 | vfree8 | vfree8 | vfree8 | varchar2(101) |
| 183 | vfree9 | vfree9 | vfree9 | varchar2(101) |
| 184 | vfree10 | vfree10 | vfree10 | varchar2(101) |
| 185 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 186 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |