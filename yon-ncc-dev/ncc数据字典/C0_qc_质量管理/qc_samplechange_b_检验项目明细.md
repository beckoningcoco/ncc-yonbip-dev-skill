# |<<

**检验项目明细 (qc_samplechange_b / nc.vo.qc.c007.entity.SamplingChangeItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4865.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_changebill_b | 检验项目明细 | pk_changebill_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 质检中心最新版本 | pk_org | varchar(20) |  | 组织_业务单元_质检中心 (qccenter) |
| 4 | pk_org_v | 质检中心 | pk_org_v | varchar(20) |  | 组织_业务单元_质检中心版本信息 (qccenter_v) |
| 5 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 6 | pk_checkitem | 检验项目 | pk_checkitem | varchar(20) |  | 检验项目 (qc_checkitem) |
| 7 | bkeyitem | 关键项目 | bkeyitem | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | bdefaultitem | 默认项目 | bdefaultitem | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | bmustreach | 必须达到 | bmustreach | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | pk_outsupplier | 外部质检机构 | pk_outsupplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 11 | vmemob | 备注 | vmemob | varchar(181) |  | 字符串 (String) |
| 12 | pk_chkstd1 | 检验方案1OID | pk_chkstd1 | varchar(20) |  | 检验方案 (qc_checkstandard) |
| 13 | pk_chkstd1_v | 检验方案1 | pk_chkstd1_v | varchar(20) |  | 检验方案多版本 (qc_checkstandard_v) |
| 14 | bincluded1 | 包含该项目1 | bincluded1 | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | vstdvalue1 | 标准值1 | vstdvalue1 | varchar(128) |  | 字符串 (String) |
| 16 | pk_chkstd2 | 检验方案2OID | pk_chkstd2 | varchar(20) |  | 检验方案 (qc_checkstandard) |
| 17 | pk_chkstd2_v | 检验方案2 | pk_chkstd2_v | varchar(20) |  | 检验方案多版本 (qc_checkstandard_v) |
| 18 | bincluded2 | 包含该项目2 | bincluded2 | char(1) |  | 布尔类型 (UFBoolean) |
| 19 | vstdvalue2 | 标准值2 | vstdvalue2 | varchar(128) |  | 字符串 (String) |
| 20 | pk_chkstd3 | 检验方案3OID | pk_chkstd3 | varchar(20) |  | 检验方案 (qc_checkstandard) |
| 21 | pk_chkstd3_v | 检验方案3 | pk_chkstd3_v | varchar(20) |  | 检验方案多版本 (qc_checkstandard_v) |
| 22 | bincluded3 | 包含该项目3 | bincluded3 | char(1) |  | 布尔类型 (UFBoolean) |
| 23 | vstdvalue3 | 标准值3 | vstdvalue3 | varchar(128) |  | 字符串 (String) |
| 24 | pk_chkstd4 | 检验方案4OID | pk_chkstd4 | varchar(20) |  | 检验方案 (qc_checkstandard) |
| 25 | pk_chkstd4_v | 检验方案4 | pk_chkstd4_v | varchar(20) |  | 检验方案多版本 (qc_checkstandard_v) |
| 26 | bincluded4 | 包含该项目4 | bincluded4 | char(1) |  | 布尔类型 (UFBoolean) |
| 27 | vstdvalue4 | 标准值4 | vstdvalue4 | varchar(128) |  | 字符串 (String) |
| 28 | pk_chkstd5 | 检验方案5OID | pk_chkstd5 | varchar(20) |  | 检验方案 (qc_checkstandard) |
| 29 | pk_chkstd5_v | 检验方案5 | pk_chkstd5_v | varchar(20) |  | 检验方案多版本 (qc_checkstandard_v) |
| 30 | bincluded5 | 包含该项目5 | bincluded5 | char(1) |  | 布尔类型 (UFBoolean) |
| 31 | vstdvalue5 | 标准值5 | vstdvalue5 | varchar(128) |  | 字符串 (String) |
| 32 | pk_chkstd6 | 检验方案6OID | pk_chkstd6 | varchar(20) |  | 检验方案 (qc_checkstandard) |
| 33 | pk_chkstd6_v | 检验方案6 | pk_chkstd6_v | varchar(20) |  | 检验方案多版本 (qc_checkstandard_v) |
| 34 | bincluded6 | 包含该项目6 | bincluded6 | char(1) |  | 布尔类型 (UFBoolean) |
| 35 | vstdvalue6 | 标准值6 | vstdvalue6 | varchar(128) |  | 字符串 (String) |
| 36 | pk_chkstd7 | 检验方案7OID | pk_chkstd7 | varchar(20) |  | 检验方案 (qc_checkstandard) |
| 37 | pk_chkstd7_v | 检验方案7 | pk_chkstd7_v | varchar(20) |  | 检验方案多版本 (qc_checkstandard_v) |
| 38 | bincluded7 | 包含该项目7 | bincluded7 | char(1) |  | 布尔类型 (UFBoolean) |
| 39 | vstdvalue7 | 标准值7 | vstdvalue7 | varchar(128) |  | 字符串 (String) |
| 40 | pk_chkstd8 | 检验方案8OID | pk_chkstd8 | varchar(20) |  | 检验方案 (qc_checkstandard) |
| 41 | pk_chkstd8_v | 检验方案8 | pk_chkstd8_v | varchar(20) |  | 检验方案多版本 (qc_checkstandard_v) |
| 42 | bincluded8 | 包含该项目8 | bincluded8 | char(1) |  | 布尔类型 (UFBoolean) |
| 43 | vstdvalue8 | 标准值8 | vstdvalue8 | varchar(128) |  | 字符串 (String) |
| 44 | pk_chkstd9 | 检验方案9OID | pk_chkstd9 | varchar(20) |  | 检验方案 (qc_checkstandard) |
| 45 | pk_chkstd9_v | 检验方案9 | pk_chkstd9_v | varchar(20) |  | 检验方案多版本 (qc_checkstandard_v) |
| 46 | bincluded9 | 包含该项目9 | bincluded9 | char(1) |  | 布尔类型 (UFBoolean) |
| 47 | vstdvalue9 | 标准值9 | vstdvalue9 | varchar(128) |  | 字符串 (String) |
| 48 | pk_chkstd10 | 检验方案10OID | pk_chkstd10 | varchar(20) |  | 检验方案 (qc_checkstandard) |
| 49 | pk_chkstd10_v | 检验方案10 | pk_chkstd10_v | varchar(20) |  | 检验方案多版本 (qc_checkstandard_v) |
| 50 | bincluded10 | 包含该项目10 | bincluded10 | char(1) |  | 布尔类型 (UFBoolean) |
| 51 | vstdvalue10 | 标准值10 | vstdvalue10 | varchar(128) |  | 字符串 (String) |
| 52 | pk_chkcenter | 检测中心OID | pk_chkcenter | varchar(20) |  | 组织_业务单元_质检中心 (qccenter) |
| 53 | pk_chkcenter_v | 检测中心 | pk_chkcenter_v | varchar(20) |  | 组织_业务单元_质检中心版本信息 (qccenter_v) |
| 54 | nsampastnumbb | 样本量 | nsampastnumbb | decimal(28, 8) |  | 数值 (UFDouble) |
| 55 | nacnum | 接受数 | nacnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 56 | nrenum | 拒收数 | nrenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 57 | pk_bcheckmode | 取样方式表体 | pk_bcheckmode | varchar(20) |  | 取样方式 (qc_checkmode) |
| 58 | vbdef1 | 自定义项1 | vbdef1 | varchar(100) |  | 字符串 (String) |
| 59 | vbdef2 | 自定义项2 | vbdef2 | varchar(100) |  | 字符串 (String) |
| 60 | vbdef3 | 自定义项3 | vbdef3 | varchar(100) |  | 字符串 (String) |
| 61 | vbdef4 | 自定义项4 | vbdef4 | varchar(100) |  | 字符串 (String) |
| 62 | vbdef5 | 自定义项5 | vbdef5 | varchar(100) |  | 字符串 (String) |
| 63 | vbdef6 | 自定义项6 | vbdef6 | varchar(100) |  | 字符串 (String) |
| 64 | vbdef7 | 自定义项7 | vbdef7 | varchar(100) |  | 字符串 (String) |
| 65 | vbdef8 | 自定义项8 | vbdef8 | varchar(100) |  | 字符串 (String) |
| 66 | vbdef9 | 自定义项9 | vbdef9 | varchar(100) |  | 字符串 (String) |
| 67 | vbdef10 | 自定义项10 | vbdef10 | varchar(100) |  | 字符串 (String) |
| 68 | vbdef11 | 自定义项11 | vbdef11 | varchar(100) |  | 字符串 (String) |
| 69 | vbdef12 | 自定义项12 | vbdef12 | varchar(100) |  | 字符串 (String) |
| 70 | vbdef13 | 自定义项13 | vbdef13 | varchar(100) |  | 字符串 (String) |
| 71 | vbdef14 | 自定义项14 | vbdef14 | varchar(100) |  | 字符串 (String) |
| 72 | vbdef15 | 自定义项15 | vbdef15 | varchar(100) |  | 字符串 (String) |
| 73 | vbdef16 | 自定义项16 | vbdef16 | varchar(100) |  | 字符串 (String) |
| 74 | vbdef17 | 自定义项17 | vbdef17 | varchar(100) |  | 字符串 (String) |
| 75 | vbdef18 | 自定义项18 | vbdef18 | varchar(100) |  | 字符串 (String) |
| 76 | vbdef19 | 自定义项19 | vbdef19 | varchar(100) |  | 字符串 (String) |
| 77 | vbdef20 | 自定义项20 | vbdef20 | varchar(100) |  | 字符串 (String) |