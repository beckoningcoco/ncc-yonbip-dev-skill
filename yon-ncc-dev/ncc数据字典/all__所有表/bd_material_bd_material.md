# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6981.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_material | pk_material | pk_material | char(20) | √ |
| 2 | abctype | abctype | abctype | char(50) |
| 3 | charge | charge | charge | char(1) |
| 4 | code | code | code | varchar2(40) | √ |
| 5 | constr | constr | constr | varchar2(200) |
| 6 | costprice | costprice | costprice | number(28, 8) |
| 7 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 8 | deletestate | deletestate | deletestate | number(38, 0) |
| 9 | delperson | delperson | delperson | varchar2(20) |  |  | '~' |
| 10 | deltime | deltime | deltime | char(19) |
| 11 | dememo | dememo | dememo | varchar2(200) |
| 12 | discountflag | discountflag | discountflag | char(1) |  |  | 'N' |
| 13 | dt_pois | dt_pois | dt_pois | varchar2(50) |
| 14 | dt_storetype | dt_storetype | dt_storetype | varchar2(50) |
| 15 | durable | durable | durable | char(1) |
| 16 | electronicsale | electronicsale | electronicsale | char(1) |
| 17 | ematerialspec | ematerialspec | ematerialspec | varchar2(400) |
| 18 | enablestate | enablestate | enablestate | number(38, 0) | √ |  | 2 |
| 19 | ename | ename | ename | varchar2(200) |
| 20 | eu_manufactory | eu_manufactory | eu_manufactory | varchar2(20) |  |  | '~' |
| 21 | eu_muputype | eu_muputype | eu_muputype | varchar2(50) |
| 22 | eu_pdprice | eu_pdprice | eu_pdprice | varchar2(50) |
| 23 | eu_pois | eu_pois | eu_pois | varchar2(20) |  |  | '~' |
| 24 | eu_val | eu_val | eu_val | varchar2(20) |  |  | '~' |
| 25 | factor_fb | factor_fb | factor_fb | varchar2(50) |
| 26 | factor_mb | factor_mb | factor_mb | varchar2(50) |
| 27 | featureclass | featureclass | featureclass | varchar2(20) |
| 28 | fee | fee | fee | char(1) |  |  | 'N' |
| 29 | flag_base | flag_base | flag_base | char(1) |
| 30 | flag_drug | flag_drug | flag_drug | char(1) |
| 31 | flag_gmp | flag_gmp | flag_gmp | char(1) |
| 32 | flag_highrisk | flag_highrisk | flag_highrisk | char(1) |
| 33 | flag_iv | flag_iv | flag_iv | char(1) |
| 34 | flag_monitor | flag_monitor | flag_monitor | char(1) |
| 35 | flag_nuclide | flag_nuclide | flag_nuclide | char(1) |
| 36 | flag_nutrition | flag_nutrition | flag_nutrition | char(1) |
| 37 | flag_onlycharge | flag_onlycharge | flag_onlycharge | char(1) |
| 38 | flag_province | flag_province | flag_province | char(1) |
| 39 | flag_quantitypu | flag_quantitypu | flag_quantitypu | char(1) |
| 40 | flag_reag | flag_reag | flag_reag | char(1) |
| 41 | flag_refrigeration | flag_refrigeration | flag_refrigeration | char(1) |
| 42 | flag_rm | flag_rm | flag_rm | char(1) |
| 43 | flag_rsa | flag_rsa | flag_rsa | char(1) |
| 44 | flag_sd | flag_sd | flag_sd | char(1) |
| 45 | flag_st | flag_st | flag_st | char(1) |
| 46 | flag_tend | flag_tend | flag_tend | char(1) |
| 47 | flag_tpn | flag_tpn | flag_tpn | char(1) |
| 48 | flag_vacc | flag_vacc | flag_vacc | char(1) |
| 49 | functionstr | functionstr | functionstr | varchar2(128) |
| 50 | goodsprtname | goodsprtname | goodsprtname | varchar2(200) |
| 51 | gopr | gopr | gopr | varchar2(50) |
| 52 | graphid | graphid | graphid | varchar2(50) |
| 53 | guide | guide | guide | varchar2(200) |
| 54 | highvalue | highvalue | highvalue | char(1) |
| 55 | importstr | importstr | importstr | char(1) |
| 56 | indica | indica | indica | varchar2(200) |
| 57 | inpurchase | inpurchase | inpurchase | char(1) |
| 58 | intolerance | intolerance | intolerance | number(20, 4) | √ |  | 0 |
| 59 | iselectrans | iselectrans | iselectrans | char(1) |
| 60 | isfeature | isfeature | isfeature | char(1) |
| 61 | ishproitems | ishproitems | ishproitems | char(1) |
| 62 | isprimarybarcode | isprimarybarcode | isprimarybarcode | char(1) |
| 63 | latest | latest | latest | char(1) | √ |  | 'N' |
| 64 | managedept | managedept | managedept | varchar2(20) |  |  | '~' |
| 65 | manufacturer | manufacturer | manufacturer | varchar2(20) |  |  | '~' |
| 66 | matchmode | matchmode | matchmode | number(38, 0) |
| 67 | materialbarcode | materialbarcode | materialbarcode | varchar2(30) |
| 68 | materialmgt | materialmgt | materialmgt | number(38, 0) |
| 69 | materialmnecode | materialmnecode | materialmnecode | varchar2(50) |
| 70 | materialshortname | materialshortname | materialshortname | varchar2(300) |
| 71 | materialspec | materialspec | materialspec | varchar2(400) |
| 72 | materialstr | materialstr | materialstr | varchar2(128) |
| 73 | materialtype | materialtype | materialtype | varchar2(400) |
| 74 | medicalconsumlevel | medicalconsumlevel | medicalconsumlevel | varchar2(20) |  |  | '~' |
| 75 | medicalconsumtype | medicalconsumtype | medicalconsumtype | varchar2(20) |  |  | '~' |
| 76 | memo | memo | memo | varchar2(150) |
| 77 | mini_req | mini_req | mini_req | number(28, 8) |
| 78 | name | name | name | varchar2(300) | √ |
| 79 | name2 | name2 | name2 | varchar2(300) |
| 80 | name3 | name3 | name3 | varchar2(300) |
| 81 | name4 | name4 | name4 | varchar2(300) |
| 82 | name5 | name5 | name5 | varchar2(300) |
| 83 | name6 | name6 | name6 | varchar2(300) |
| 84 | name_chem | name_chem | name_chem | varchar2(50) |
| 85 | name_pd | name_pd | name_pd | varchar2(50) |
| 86 | onemedicaltype | onemedicaltype | onemedicaltype | varchar2(20) |  |  | '~' |
| 87 | outcloselowerlimit | outcloselowerlimit | outcloselowerlimit | number(20, 4) | √ |  | 0 |
| 88 | outtolerance | outtolerance | outtolerance | number(20, 4) | √ |  | 0 |
| 89 | pk_anti | pk_anti | pk_anti | varchar2(50) |
| 90 | pk_brand | pk_brand | pk_brand | varchar2(20) |  |  | '~' |
| 91 | pk_chcate | pk_chcate | pk_chcate | varchar2(20) |  |  | '~' |
| 92 | pk_cheap | pk_cheap | pk_cheap | varchar2(20) |  |  | '~' |
| 93 | pk_cumandoc | pk_cumandoc | pk_cumandoc | varchar2(20) |  |  | '~' |
| 94 | pk_dosage | pk_dosage | pk_dosage | varchar2(20) |  |  | '~' |
| 95 | pk_freq_def | pk_freq_def | pk_freq_def | varchar2(50) |
| 96 | pk_goodscode | pk_goodscode | pk_goodscode | varchar2(20) |  |  | '~' |
| 97 | pk_group | pk_group | pk_group | char(20) | √ |
| 98 | pk_marasstframe | pk_marasstframe | pk_marasstframe | varchar2(20) |  |  | '~' |
| 99 | pk_marbasclass | pk_marbasclass | pk_marbasclass | char(20) | √ |
| 100 | pk_material_pf | pk_material_pf | pk_material_pf | varchar2(20) |  |  | '~' |
| 101 | pk_mattaxes | pk_mattaxes | pk_mattaxes | varchar2(20) | √ |  | '~' |
| 102 | pk_measdoc | pk_measdoc | pk_measdoc | char(20) | √ |
| 103 | pk_measdoc_base | pk_measdoc_base | pk_measdoc_base | varchar2(20) |  |  | '~' |
| 104 | pk_measdoc_def | pk_measdoc_def | pk_measdoc_def | varchar2(20) |  |  | '~' |
| 105 | pk_measdoc_med | pk_measdoc_med | pk_measdoc_med | varchar2(20) |  |  | '~' |
| 106 | pk_org | pk_org | pk_org | char(20) | √ |
| 107 | pk_pharm | pk_pharm | pk_pharm | varchar2(20) |  |  | '~' |
| 108 | pk_prodline | pk_prodline | pk_prodline | varchar2(20) |  |  | '~' |
| 109 | pk_source | pk_source | pk_source | varchar2(20) |  |  | '~' |
| 110 | pk_storetype | pk_storetype | pk_storetype | varchar2(20) |  |  | '~' |
| 111 | pk_taxitems | pk_taxitems | pk_taxitems | varchar2(20) |  |  | '~' |
| 112 | pk_usage_def | pk_usage_def | pk_usage_def | varchar2(50) |
| 113 | prodarea | prodarea | prodarea | varchar2(20) |  |  | '~' |
| 114 | productfamily | productfamily | productfamily | char(1) | √ |  | 'N' |
| 115 | productregister | productregister | productregister | varchar2(128) |
| 116 | prolifeperiod | prolifeperiod | prolifeperiod | number(38, 0) |
| 117 | purpose | purpose | purpose | varchar2(128) |
| 118 | qualitymanflag | qualitymanflag | qualitymanflag | char(1) |
| 119 | qualitynum | qualitynum | qualitynum | number(38, 0) |
| 120 | qualityunit | qualityunit | qualityunit | number(38, 0) |
| 121 | quan_def | quan_def | quan_def | number(28, 8) |
| 122 | react | react | react | varchar2(200) |
| 123 | registrationtype | registrationtype | registrationtype | varchar2(20) |  |  | '~' |
| 124 | retail | retail | retail | char(1) |  |  | 'N' |
| 125 | risktype | risktype | risktype | varchar2(20) |  |  | '~' |
| 126 | saleprice | saleprice | saleprice | number(28, 8) |
| 127 | serialmanaflag | serialmanaflag | serialmanaflag | char(1) |
| 128 | sernumunit | sernumunit | sernumunit | varchar2(20) |  |  | '~' |
| 129 | setpartsflag | setpartsflag | setpartsflag | char(1) |  |  | 'N' |
| 130 | special | special | special | char(1) |
| 131 | storeback | storeback | storeback | char(1) |
| 132 | storeunitnum | storeunitnum | storeunitnum | number(20, 8) |
| 133 | unitheight | unitheight | unitheight | varchar2(20) |
| 134 | unitlength | unitlength | unitlength | varchar2(20) |
| 135 | unitvolume | unitvolume | unitvolume | number(20, 8) |  |  | 0 |
| 136 | unitweight | unitweight | unitweight | number(20, 8) |  |  | 0 |
| 137 | unitwidth | unitwidth | unitwidth | varchar2(20) |
| 138 | usagenote | usagenote | usagenote | varchar2(50) |
| 139 | version | version | version | number(38, 0) | √ |  | 1 |
| 140 | wholemanaflag | wholemanaflag | wholemanaflag | char(1) |
| 141 | def1 | def1 | def1 | varchar2(101) |
| 142 | def2 | def2 | def2 | varchar2(101) |
| 143 | def3 | def3 | def3 | varchar2(101) |
| 144 | def4 | def4 | def4 | varchar2(101) |
| 145 | def5 | def5 | def5 | varchar2(101) |
| 146 | def6 | def6 | def6 | varchar2(101) |
| 147 | def7 | def7 | def7 | varchar2(101) |
| 148 | def8 | def8 | def8 | varchar2(101) |
| 149 | def9 | def9 | def9 | varchar2(101) |
| 150 | def10 | def10 | def10 | varchar2(101) |
| 151 | def11 | def11 | def11 | varchar2(101) |
| 152 | def12 | def12 | def12 | varchar2(101) |
| 153 | def13 | def13 | def13 | varchar2(101) |
| 154 | def14 | def14 | def14 | varchar2(101) |
| 155 | def15 | def15 | def15 | varchar2(101) |
| 156 | def16 | def16 | def16 | varchar2(101) |
| 157 | def17 | def17 | def17 | varchar2(101) |
| 158 | def18 | def18 | def18 | varchar2(101) |
| 159 | def19 | def19 | def19 | varchar2(101) |
| 160 | def20 | def20 | def20 | varchar2(101) |
| 161 | def21 | def21 | def21 | varchar2(101) |
| 162 | def22 | def22 | def22 | varchar2(101) |
| 163 | def23 | def23 | def23 | varchar2(101) |
| 164 | def24 | def24 | def24 | varchar2(101) |
| 165 | def25 | def25 | def25 | varchar2(101) |
| 166 | def26 | def26 | def26 | varchar2(101) |
| 167 | def27 | def27 | def27 | varchar2(101) |
| 168 | def28 | def28 | def28 | varchar2(101) |
| 169 | def29 | def29 | def29 | varchar2(101) |
| 170 | def30 | def30 | def30 | varchar2(101) |
| 171 | def31 | def31 | def31 | varchar2(101) |
| 172 | def32 | def32 | def32 | varchar2(101) |
| 173 | def33 | def33 | def33 | varchar2(101) |
| 174 | def34 | def34 | def34 | varchar2(101) |
| 175 | def35 | def35 | def35 | varchar2(101) |
| 176 | def36 | def36 | def36 | varchar2(101) |
| 177 | def37 | def37 | def37 | varchar2(101) |
| 178 | def38 | def38 | def38 | varchar2(101) |
| 179 | def39 | def39 | def39 | varchar2(101) |
| 180 | def40 | def40 | def40 | varchar2(101) |
| 181 | def41 | def41 | def41 | varchar2(101) |
| 182 | def42 | def42 | def42 | varchar2(101) |
| 183 | def43 | def43 | def43 | varchar2(101) |
| 184 | def44 | def44 | def44 | varchar2(101) |
| 185 | def45 | def45 | def45 | varchar2(101) |
| 186 | def46 | def46 | def46 | varchar2(101) |
| 187 | def47 | def47 | def47 | varchar2(101) |
| 188 | def48 | def48 | def48 | varchar2(101) |
| 189 | def49 | def49 | def49 | varchar2(101) |
| 190 | def50 | def50 | def50 | varchar2(101) |
| 191 | creationtime | creationtime | creationtime | char(19) |
| 192 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 193 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 194 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 195 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 196 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |