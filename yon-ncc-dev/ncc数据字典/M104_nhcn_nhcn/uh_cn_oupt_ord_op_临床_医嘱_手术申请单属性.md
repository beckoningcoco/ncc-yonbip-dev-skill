# |<<

**临床_医嘱_手术申请单属性 (uh_cn_oupt_ord_op / com.yonyou.yh.nhis.cn.ord.oc.v2.vo.CNOcOrdOpVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6039.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ordop | 医嘱手术申请单属性主键 | pk_ordop | char(20) | √ | 主键 (UFID) |
| 2 | pk_ord | 医嘱 | pk_ord | varchar(20) |  | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 4 | pk_org | 所属机构 | pk_org | varchar(20) |  | 字符串 (String) |
| 5 | eu_optype | 手术类型 | eu_optype | varchar(50) |  | 字符串 (String) |
| 6 | pk_diag_bop | 术前诊断 | pk_diag_bop | varchar(20) |  | 字符串 (String) |
| 7 | desc_diag_bop | 术前诊断名称 | desc_diag_bop | varchar(50) |  | 字符串 (String) |
| 8 | pk_psn_phy_op | 手术主刀医生 | pk_psn_phy_op | varchar(20) |  | 字符串 (String) |
| 9 | name_psn_phy_op | 主刀医生名称 | name_psn_phy_op | varchar(50) |  | 字符串 (String) |
| 10 | dt_oplevel | 手术级别编码 | dt_oplevel | varchar(50) |  | 字符串 (String) |
| 11 | pk_diag_op | 主要手术编码 | pk_diag_op | varchar(50) |  | 字符串 (String) |
| 12 | desc_op | 手术描述 | desc_op | varchar(256) |  | 字符串 (String) |
| 13 | desc_op_sub | 附加手术 | desc_op_sub | varchar(50) |  | 字符串 (String) |
| 14 | dt_anae | 拟行麻醉方法编码 | dt_anae | varchar(50) |  | 字符串 (String) |
| 15 | dt_asepsis | 无菌程度编码 | dt_asepsis | varchar(50) |  | 字符串 (String) |
| 16 | dt_posi | 手术体位编码 | dt_posi | varchar(50) |  | 字符串 (String) |
| 17 | dt_bodypart_op | 手术目标部位编码 | dt_bodypart_op | varchar(50) |  | 字符串 (String) |
| 18 | date_op_begin | 计划手术日期范围_开始 | date_op_begin | char(19) |  | 日期 (UFDate) |
| 19 | date_op_end | 计划手术日期范围_结束 | date_op_end | char(19) |  | 日期 (UFDate) |
| 20 | pk_opt | 手术台编码 | pk_opt | varchar(20) |  | 字符串 (String) |
| 21 | pk_psn_anae | 手术麻醉医生 | pk_psn_anae | varchar(20) |  | 字符串 (String) |
| 22 | name_psn_anae | 手术麻醉医生名称 | name_psn_anae | varchar(50) |  | 字符串 (String) |
| 23 | pk_psn_asis | 手术一助 | pk_psn_asis | varchar(20) |  | 字符串 (String) |
| 24 | name_psn_asis | 手术一助名称 | name_psn_asis | varchar(50) |  | 字符串 (String) |
| 25 | pk_psn_asis2 | 手术二助 | pk_psn_asis2 | varchar(20) |  | 字符串 (String) |
| 26 | name_psn_asis2 | 手术二助名称 | name_psn_asis2 | varchar(50) |  | 字符串 (String) |
| 27 | date_confirm | 排班后确认日期 | date_confirm | char(19) |  | 日期 (UFDate) |
| 28 | ticketno | 手术台次 | ticketno | int |  | 整数 (Integer) |
| 29 | date_est_begin | 预计手术开始时间 | date_est_begin | char(19) |  | 日期 (UFDate) |
| 30 | eu_status | 手术过程状态 | eu_status | varchar(50) |  | 字符串 (String) |
| 31 | note_op | 备注 | note_op | varchar(4000) |  | 字符串 (String) |
| 32 | flag_finish | 手术完成标志 | flag_finish | char(1) |  | 布尔类型 (UFBoolean) |
| 33 | app_no | 预约单号 | app_no | varchar(50) |  | 字符串 (String) |
| 34 | flag_nil | 传染病检查结果-全隐标志 | flag_nil | char(1) |  | 布尔类型 (UFBoolean) |
| 35 | flag_hbv | 传染病检查结果-HBV标志 | flag_hbv | char(1) |  | 布尔类型 (UFBoolean) |
| 36 | flag_hcv | 传染病检查结果-HCV标志 | flag_hcv | char(1) |  | 布尔类型 (UFBoolean) |
| 37 | flag_hiv | 传染病检查结果-HIV标志 | flag_hiv | char(1) |  | 布尔类型 (UFBoolean) |
| 38 | flag_syphilis | 传染病检查结果-梅毒标志 | flag_syphilis | char(1) |  | 布尔类型 (UFBoolean) |
| 39 | flag_other | 传染病检查结果-其他标志 | flag_other | char(1) |  | 布尔类型 (UFBoolean) |
| 40 | flag_onresult | 传染病检查结果未回标志 | flag_onresult | char(1) |  | 布尔类型 (UFBoolean) |
| 41 | flag_mdr | 多重耐药菌标志 | flag_mdr | char(1) |  | 布尔类型 (UFBoolean) |
| 42 | flag_emrop | 急诊标志 | flag_emrop | char(1) |  | 布尔类型 (UFBoolean) |
| 43 | dt_slottype | 切口标志 | dt_slottype | varchar(50) |  | 字符串 (String) |