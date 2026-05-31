# |<<

**大连结算 (hp_dl_set / com.yonyou.yh.nhis.hp.dalian.vo.DlHpSetVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2607.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dlset_0 | 保留主键 | pk_dlset_0 | char(20) | √ | 主键 (UFID) |
| 2 | num_group_1 | 医院代码 | num_group_1 | varchar(4) |  | 字符串 (String) |
| 3 | flag_dept_2 | 子门诊标识 | flag_dept_2 | varchar(1) |  | 字符串 (String) |
| 4 | num_psn_3 | 个人编号 | num_psn_3 | varchar(8) |  | 字符串 (String) |
| 5 | num_card_4 | IC卡号 | num_card_4 | varchar(9) |  | 字符串 (String) |
| 6 | num_pv_5 | 治疗序号 | num_pv_5 | int |  | 整数 (Integer) |
| 7 | num_char_6 | 冲账序号 | num_char_6 | int |  | 整数 (Integer) |
| 8 | date_set_7 | 结算时间 | date_set_7 | char(19) |  | 日期时间 (UFDateTime) |
| 9 | num_case_8 | 病志号 | num_case_8 | varchar(10) |  | 字符串 (String) |
| 10 | fee_zc_9 | 诊察费 | fee_zc_9 | decimal(12, 2) |  | 数值 (UFDouble) |
| 11 | fee_caoyao_10 | 草药费 | fee_caoyao_10 | decimal(12, 2) |  | 数值 (UFDouble) |
| 12 | fee_chengyao_11 | 成药费 | fee_chengyao_11 | decimal(12, 2) |  | 数值 (UFDouble) |
| 13 | fee_ord_12 | 西药费 | fee_ord_12 | decimal(12, 2) |  | 数值 (UFDouble) |
| 14 | fee_lis_13 | 检查费 | fee_lis_13 | decimal(12, 2) |  | 数值 (UFDouble) |
| 15 | fee_treat_14 | 治疗费 | fee_treat_14 | decimal(12, 2) |  | 数值 (UFDouble) |
| 16 | fee_blood_15 | 血费 | fee_blood_15 | decimal(12, 2) |  | 数值 (UFDouble) |
| 17 | fee_blood_psn_16 | 血费自费 | fee_blood_psn_16 | decimal(12, 2) |  | 数值 (UFDouble) |
| 18 | fee_lis_da_17 | 大检费 | fee_lis_da_17 | decimal(12, 2) |  | 数值 (UFDouble) |
| 19 | fee_lis_da_psn_18 | 大检自费 | fee_lis_da_psn_18 | decimal(12, 2) |  | 数值 (UFDouble) |
| 20 | fee_treat_spc_19 | 特殊治疗费 | fee_treat_spc_19 | decimal(12, 2) |  | 数值 (UFDouble) |
| 21 | fee_treat_spc_psn_20 | 特殊治疗自费 | fee_treat_spc_psn_20 | decimal(12, 2) |  | 数值 (UFDouble) |
| 22 | fee_bxn_psn_21 | 保险内自费费用 | fee_bxn_psn_21 | decimal(12, 2) |  | 数值 (UFDouble) |
| 23 | fee_fylbx_22 | 非医疗保险费用 | fee_fylbx_22 | decimal(12, 2) |  | 数值 (UFDouble) |
| 24 | set_grzhye_23 | 结算后个人帐户余额 | set_grzhye_23 | decimal(12, 2) |  | 数值 (UFDouble) |
| 25 | tot_set_tczf_24 | 结算后统筹支付累计 | tot_set_tczf_24 | decimal(12, 2) |  | 数值 (UFDouble) |
| 26 | tot_set_tczf_mzmb_25 | 结算后门诊慢病统筹支付累计 | tot_set_tczf_mzmb_25 | decimal(12, 2) |  | 数值 (UFDouble) |
| 27 | tot_set_grfdjz_psn_26 | 结算后个人负担较重自付累计 | tot_set_grfdjz_psn_26 | decimal(12, 2) |  | 数值 (UFDouble) |
| 28 | tot_set_yljz_27 | 结算后医疗救助累计 | tot_set_yljz_27 | decimal(12, 2) |  | 数值 (UFDouble) |
| 29 | bak_1_28 | 备用1 | bak_1_28 | decimal(12, 2) |  | 数值 (UFDouble) |
| 30 | jsq_zhye_29 | 结算前基本帐户余额 | jsq_zhye_29 | decimal(12, 2) |  | 数值 (UFDouble) |
| 31 | jsq_bzzhye_30 | 结算前补助账户余额 | jsq_bzzhye_30 | decimal(12, 2) |  | 数值 (UFDouble) |
| 32 | tot_jsq_tczf_31 | 结算前统筹支付累计 | tot_jsq_tczf_31 | decimal(12, 2) |  | 数值 (UFDouble) |
| 33 | tot_jsq_tczf_mzmb_32 | 结算前门诊慢病统筹支付累计 | tot_jsq_tczf_mzmb_32 | decimal(12, 2) |  | 数值 (UFDouble) |
| 34 | tot_jsq_grfdjz_psn_33 | 结算前个人负担较重自付累计 | tot_jsq_grfdjz_psn_33 | decimal(12, 2) |  | 数值 (UFDouble) |
| 35 | tot_jsq_yljz_34 | 结算前医疗救助累计 | tot_jsq_yljz_34 | decimal(12, 2) |  | 数值 (UFDouble) |
| 36 | bak_2_35 | 备用2 | bak_2_35 | decimal(12, 2) |  | 数值 (UFDouble) |
| 37 | tot_grfdjz_psn_36 | 个人负担较重补助支付累计 | tot_grfdjz_psn_36 | decimal(12, 2) |  | 数值 (UFDouble) |
| 38 | bczf_psnzh_jb_37 | 本次基本个人帐户支付 | bczf_psnzh_jb_37 | decimal(12, 2) |  | 数值 (UFDouble) |
| 39 | bczf_psnzh_bz_38 | 本次补助个人帐户支付 | bczf_psnzh_bz_38 | decimal(12, 2) |  | 数值 (UFDouble) |
| 40 | bczf_tc_jb_39 | 本次基本统筹支付 | bczf_tc_jb_39 | decimal(12, 2) |  | 数值 (UFDouble) |
| 41 | bcjbtc_psn_40 | 本次基本统筹自付 | bcjbtc_psn_40 | decimal(12, 2) |  | 数值 (UFDouble) |
| 42 | bcbctczf_41 | 本次补充统筹支付 | bcbctczf_41 | decimal(12, 2) |  | 数值 (UFDouble) |
| 43 | bcbctczf_42 | 本次补充统筹自付 | bcbctczf_42 | decimal(12, 2) |  | 数值 (UFDouble) |
| 44 | bctczf_mzmb_43 | 本次门诊慢病统筹支付 | bctczf_mzmb_43 | decimal(12, 2) |  | 数值 (UFDouble) |
| 45 | bczf_mzmb_psn_44 | 本次门诊慢病统筹自付 | bczf_mzmb_psn_44 | decimal(12, 2) |  | 数值 (UFDouble) |
| 46 | bczf_grfdjz_jmdbbx_45 | 本次个人负担较重补助支付或居民大病保险支付 | bczf_grfdjz_jmdbbx_45 | decimal(12, 2) |  | 数值 (UFDouble) |
| 47 | bczf_qfbzbz_gwy_46 | 本次公务员起付标准补助支付 | bczf_qfbzbz_gwy_46 | decimal(12, 2) |  | 数值 (UFDouble) |
| 48 | bczf_jbbzbx_gwy_47 | 本次公务员基本补助保险支付 | bczf_jbbzbx_gwy_47 | decimal(12, 2) |  | 数值 (UFDouble) |
| 49 | bczf_fjbbzbx_gwy_48 | 本次公务员非基本补助保险支付 | bczf_fjbbzbx_gwy_48 | decimal(12, 2) |  | 数值 (UFDouble) |
| 50 | bzcf_spc_zlbz_gwy_49 | 本次公务员特殊治疗补助支付 | bzcf_spc_zlbz_gwy_49 | decimal(12, 2) |  | 数值 (UFDouble) |
| 51 | bczf_sybxbz_50 | 本次商业保险补助支付 | bczf_sybxbz_50 | decimal(12, 2) |  | 数值 (UFDouble) |
| 52 | bczf_bxn_51 | 本次保险内自付 | bczf_bxn_51 | decimal(12, 2) |  | 数值 (UFDouble) |
| 53 | bczf_fbx_52 | 本次非保险自付 | bczf_fbx_52 | decimal(12, 2) |  | 数值 (UFDouble) |
| 54 | bczf_yljz_53 | 本次医疗救助支付 | bczf_yljz_53 | decimal(12, 2) |  | 数值 (UFDouble) |
| 55 | bak_3_54 | 备用3 | bak_3_54 | decimal(12, 2) |  | 数值 (UFDouble) |
| 56 | bcbf_grfdjz_bzqf_55 | 本次个人负担较重补助起付部分 | bcbf_grfdjz_bzqf_55 | decimal(12, 2) |  | 数值 (UFDouble) |
| 57 | qfbz_56 | 起付标准 | qfbz_56 | decimal(12, 2) |  | 数值 (UFDouble) |
| 58 | num_zhuanzhen_57 | 转诊单号 | num_zhuanzhen_57 | varchar(6) |  | 字符串 (String) |
| 59 | type_pv_58 | 就诊分类 | type_pv_58 | varchar(1) |  | 字符串 (String) |
| 60 | type_hp2_59 | 参保类别2 | type_hp2_59 | varchar(1) |  | 字符串 (String) |
| 61 | type_hp3_60 | 参保类别3 | type_hp3_60 | varchar(1) |  | 字符串 (String) |
| 62 | area_tc_61 | 统筹区域 | area_tc_61 | varchar(1) |  | 字符串 (String) |
| 63 | type_zhigong_62 | 职工就医类别 | type_zhigong_62 | varchar(1) |  | 字符串 (String) |
| 64 | code_diag_63 | 诊断编码 | code_diag_63 | varchar(16) |  | 字符串 (String) |
| 65 | code_dept_64 | 科室编码 | code_dept_64 | varchar(10) |  | 字符串 (String) |
| 66 | code_doc_65 | 医师编码 | code_doc_65 | varchar(8) |  | 字符串 (String) |
| 67 | code_doc_zhuzhi_66 | 主治医师编码 | code_doc_zhuzhi_66 | varchar(8) |  | 字符串 (String) |
| 68 | code_cod_zhuren_67 | 主任医师编码 | code_cod_zhuren_67 | varchar(8) |  | 字符串 (String) |
| 69 | code_opera_68 | 操作员代码 | code_opera_68 | varchar(6) |  | 字符串 (String) |
| 70 | name_diag_69 | 诊断名称 | name_diag_69 | varchar(30) |  | 字符串 (String) |
| 71 | flag_treatstust_70 | 治愈情况标识 | flag_treatstust_70 | varchar(1) |  | 字符串 (String) |
| 72 | date_out_71 | 出院日期 | date_out_71 | varchar(8) |  | 字符串 (String) |
| 73 | date_getset_72 | 传输时间 | date_getset_72 | char(19) |  | 日期时间 (UFDateTime) |
| 74 | cade_erro_73 | 错误代码 | cade_erro_73 | varchar(10) |  | 字符串 (String) |
| 75 | pk_group | 集团主键 | pk_group | varchar(50) |  | 字符串 (String) |
| 76 | pk_org | 机构主键 | pk_org | varchar(50) |  | 字符串 (String) |
| 77 | pk_pati | 患者主键 | pk_pati | varchar(50) |  | 字符串 (String) |
| 78 | pk_pv | 就诊主键 | pk_pv | varchar(50) |  | 字符串 (String) |
| 79 | pk_st | 结算主键 | pk_st | varchar(50) |  | 字符串 (String) |
| 80 | type_hp1 | 参保类别1 | type_hp1 | varchar(50) |  | 字符串 (String) |
| 81 | type_hp4 | 参保类别4 | type_hp4 | varchar(50) |  | 字符串 (String) |
| 82 | type_hp5 | 参保类别5 | type_hp5 | varchar(50) |  | 字符串 (String) |
| 83 | hp_ret | 医保返回字符串 | hp_ret | varchar(50) |  | 字符串 (String) |
| 84 | creator | 创建人 | creator | varchar(50) |  | 字符串 (String) |
| 85 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |