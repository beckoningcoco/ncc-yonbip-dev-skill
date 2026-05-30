# |<<

**检验单明细 (qc_checkbill_b / nc.vo.qc.c002.entity.CheckBillItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4830.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_checkbill_b | 检验单明细 | pk_checkbill_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 检测中心最新版本 | pk_org | varchar(20) |  | 组织_业务单元_质检中心 (qccenter) |
| 4 | pk_org_v | 检测中心 | pk_org_v | varchar(20) |  | 组织_业务单元_质检中心版本信息 (qccenter_v) |
| 5 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 6 | pk_checkitem | 检验项目编码 | pk_checkitem | varchar(20) |  | 检验项目 (qc_checkitem) |
| 7 | bkeyitem | 关键项目 | bkeyitem | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | bmustreach | 必须达到 | bmustreach | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | bdefaultitem | 默认项目 | bdefaultitem | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | vchkvalue | 实际检验值 | vchkvalue | varchar(100) |  | 字符串 (String) |
| 11 | pk_chkstd1 | 检验方案1最新版本 | pk_chkstd1 | varchar(20) |  | 检验方案 (qc_checkstandard) |
| 12 | bincluded1 | 包含该项目1 | bincluded1 | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | vstdvalue1 | 标准值1 | vstdvalue1 | varchar(1024) |  | 字符串 (String) |
| 14 | vchkresult1 | 检验结果1 | vchkresult1 | varchar(50) |  | 字符串 (String) |
| 15 | pk_chkstd2 | 检验方案2最新版本 | pk_chkstd2 | varchar(20) |  | 检验方案 (qc_checkstandard) |
| 16 | bincluded2 | 包含该项目2 | bincluded2 | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | vstdvalue2 | 标准值2 | vstdvalue2 | varchar(1024) |  | 字符串 (String) |
| 18 | vchkresult2 | 检验结果2 | vchkresult2 | varchar(50) |  | 字符串 (String) |
| 19 | pk_chkstd3 | 检验方案3最新版本 | pk_chkstd3 | varchar(20) |  | 检验方案 (qc_checkstandard) |
| 20 | bincluded3 | 包含该项目3 | bincluded3 | char(1) |  | 布尔类型 (UFBoolean) |
| 21 | vstdvalue3 | 标准值3 | vstdvalue3 | varchar(1024) |  | 字符串 (String) |
| 22 | vchkresult3 | 检验结果3 | vchkresult3 | varchar(50) |  | 字符串 (String) |
| 23 | pk_chkstd4 | 检验方案4最新版本 | pk_chkstd4 | varchar(20) |  | 检验方案 (qc_checkstandard) |
| 24 | bincluded4 | 包含该项目4 | bincluded4 | char(1) |  | 布尔类型 (UFBoolean) |
| 25 | vstdvalue4 | 标准值4 | vstdvalue4 | varchar(1024) |  | 字符串 (String) |
| 26 | vchkresult4 | 检验结果4 | vchkresult4 | varchar(50) |  | 字符串 (String) |
| 27 | pk_chkstd5 | 检验方案5最新版本 | pk_chkstd5 | varchar(20) |  | 检验方案 (qc_checkstandard) |
| 28 | bincluded5 | 包含该项目5 | bincluded5 | char(1) |  | 布尔类型 (UFBoolean) |
| 29 | vstdvalue5 | 标准值5 | vstdvalue5 | varchar(1024) |  | 字符串 (String) |
| 30 | vchkresult5 | 检验结果5 | vchkresult5 | varchar(50) |  | 字符串 (String) |
| 31 | pk_chkstd6 | 检验方案6最新版本 | pk_chkstd6 | varchar(20) |  | 检验方案 (qc_checkstandard) |
| 32 | bincluded6 | 包含该项目6 | bincluded6 | char(1) |  | 布尔类型 (UFBoolean) |
| 33 | vstdvalue6 | 标准值6 | vstdvalue6 | varchar(1024) |  | 字符串 (String) |
| 34 | vchkresult6 | 检验结果6 | vchkresult6 | varchar(50) |  | 字符串 (String) |
| 35 | pk_chkstd7 | 检验方案7最新版本 | pk_chkstd7 | varchar(20) |  | 检验方案 (qc_checkstandard) |
| 36 | bincluded7 | 包含该项目7 | bincluded7 | char(1) |  | 布尔类型 (UFBoolean) |
| 37 | vstdvalue7 | 标准值7 | vstdvalue7 | varchar(1024) |  | 字符串 (String) |
| 38 | vchkresult7 | 检验结果7 | vchkresult7 | varchar(50) |  | 字符串 (String) |
| 39 | pk_chkstd8 | 检验方案8最新版本 | pk_chkstd8 | varchar(20) |  | 检验方案 (qc_checkstandard) |
| 40 | bincluded8 | 包含该项目8 | bincluded8 | char(1) |  | 布尔类型 (UFBoolean) |
| 41 | vstdvalue8 | 标准值8 | vstdvalue8 | varchar(1024) |  | 字符串 (String) |
| 42 | vchkresult8 | 检验结果8 | vchkresult8 | varchar(50) |  | 字符串 (String) |
| 43 | pk_chkstd9 | 检验方案9最新版本 | pk_chkstd9 | varchar(20) |  | 检验方案 (qc_checkstandard) |
| 44 | bincluded9 | 包含该项目9 | bincluded9 | char(1) |  | 布尔类型 (UFBoolean) |
| 45 | vstdvalue9 | 标准值9 | vstdvalue9 | varchar(1024) |  | 字符串 (String) |
| 46 | vchkresult9 | 检验结果9 | vchkresult9 | varchar(50) |  | 字符串 (String) |
| 47 | pk_chkstd10 | 检验方案10最新版本 | pk_chkstd10 | varchar(20) |  | 检验方案 (qc_checkstandard) |
| 48 | bincluded10 | 包含该项目10 | bincluded10 | char(1) |  | 布尔类型 (UFBoolean) |
| 49 | vstdvalue10 | 标准值10 | vstdvalue10 | varchar(1024) |  | 字符串 (String) |
| 50 | vchkresult10 | 检验结果10 | vchkresult10 | varchar(50) |  | 字符串 (String) |
| 51 | baccorded | 达标 | baccorded | char(1) |  | 布尔类型 (UFBoolean) |
| 52 | pk_chkpsn | 检验员 | pk_chkpsn | varchar(20) |  | 人员基本信息 (psndoc) |
| 53 | tchecktime | 检验时间 | tchecktime | varchar(19) |  | 日期时间 (UFDateTime) |
| 54 | vmemob | 备注 | vmemob | varchar(181) |  | 字符串 (String) |
| 55 | pk_chkstd1_v | 检验方案1 | pk_chkstd1_v | varchar(20) |  | 检验方案多版本 (qc_checkstandard_v) |
| 56 | pk_chkstd2_v | 检验方案2 | pk_chkstd2_v | varchar(20) |  | 检验方案多版本 (qc_checkstandard_v) |
| 57 | pk_chkstd3_v | 检验方案3 | pk_chkstd3_v | varchar(20) |  | 检验方案多版本 (qc_checkstandard_v) |
| 58 | pk_chkstd4_v | 检验方案4 | pk_chkstd4_v | varchar(20) |  | 检验方案多版本 (qc_checkstandard_v) |
| 59 | pk_chkstd5_v | 检验方案5 | pk_chkstd5_v | varchar(20) |  | 检验方案多版本 (qc_checkstandard_v) |
| 60 | pk_chkstd6_v | 检验方案6 | pk_chkstd6_v | varchar(20) |  | 检验方案多版本 (qc_checkstandard_v) |
| 61 | pk_chkstd7_v | 检验方案7 | pk_chkstd7_v | varchar(20) |  | 检验方案多版本 (qc_checkstandard_v) |
| 62 | pk_chkstd8_v | 检验方案8 | pk_chkstd8_v | varchar(20) |  | 检验方案多版本 (qc_checkstandard_v) |
| 63 | pk_chkstd9_v | 检验方案9 | pk_chkstd9_v | varchar(20) |  | 检验方案多版本 (qc_checkstandard_v) |
| 64 | pk_chkstd10_v | 检验方案10 | pk_chkstd10_v | varchar(20) |  | 检验方案多版本 (qc_checkstandard_v) |
| 65 | ichkvaluetype | 检验值类型 | ichkvaluetype | int |  | 检验值类型 (nc.vo.qc.checkitem.enumeration.CheckTypeEnum) |  | 0=数值型; |