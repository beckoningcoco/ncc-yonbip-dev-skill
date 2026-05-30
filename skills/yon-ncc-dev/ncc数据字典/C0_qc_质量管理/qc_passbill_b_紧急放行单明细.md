# |<<

**紧急放行单明细 (qc_passbill_b / nc.vo.qc.c005.entity.PassBillItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4848.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_passbill_b | 紧急放行单明细 | pk_passbill_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 质检中心最新版本 | pk_org | varchar(20) |  | 组织_业务单元_质检中心 (qccenter) |
| 4 | pk_org_v | 质检中心 | pk_org_v | varchar(20) |  | 组织_业务单元_质检中心版本信息 (qccenter_v) |
| 5 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 6 | pk_material | 物料编码 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | pk_srcmaterial | 物料 | pk_srcmaterial | varchar(20) |  | 物料基本信息 (material_v) |
| 8 | vbatchcode | 物料批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 9 | pk_batchcode | 物料批次号主键 | pk_batchcode | varchar(20) |  | 主键 (UFID) |
| 10 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 11 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 12 | nsourcenum | 来源主数量 | nsourcenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 14 | nastnum | 数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 16 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 17 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | bclosed | 行关闭 | bclosed | char(1) |  | 布尔类型 (UFBoolean) |
| 19 | vmemob | 备注 | vmemob | varchar(181) |  | 字符串 (String) |
| 20 | cfirsttypecode | 源头单据类型 | cfirsttypecode | varchar(20) |  | 字符串 (String) |
| 21 | vfirstcode | 源头单据号 | vfirstcode | varchar(40) |  | 字符串 (String) |
| 22 | cfirstid | 源头单据主键 | cfirstid | varchar(20) |  | 主键 (UFID) |
| 23 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(20) |  | 字符串 (String) |
| 24 | vfirsttrantype | 源头交易类型 | vfirsttrantype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 25 | cfirstbid | 源头单据行主键 | cfirstbid | varchar(20) |  | 主键 (UFID) |
| 26 | csourcetypecode | 来源单据类型 | csourcetypecode | varchar(20) |  | 字符串 (String) |
| 27 | vsourcecode | 来源单据号 | vsourcecode | varchar(40) |  | 字符串 (String) |
| 28 | csourceid | 来源单据主键 | csourceid | varchar(20) |  | 主键 (UFID) |
| 29 | csourcebid | 来源单据行主键 | csourcebid | varchar(20) |  | 主键 (UFID) |
| 30 | vsourcerowno | 来源单据行号 | vsourcerowno | varchar(20) |  | 字符串 (String) |
| 31 | vsourcetrantype | 来源交易类型 | vsourcetrantype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 32 | ntotalinnum | 累计入库数量 | ntotalinnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | ntotaloutnum | 累计出库数量 | ntotaloutnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | bchkresult | 质检结果反馈行 | bchkresult | char(1) |  | 布尔类型 (UFBoolean) |
| 35 | casscustid | 客户 | casscustid | varchar(20) |  | 客户基本信息 (customer) |
| 36 | pk_serialno | 序列号主键 | pk_serialno | varchar(20) |  | 序列号档案 (SerialNoVO) |
| 37 | vsncode | 序列号 | vsncode | varchar(128) |  | 字符串 (String) |
| 38 | cfileid | 特征码主键 | cfileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 39 | cfilecode | 特征码 | cfilecode | varchar(100) |  | 字符串 (String) |
| 40 | nsnnum | 序列号主数量 | nsnnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 41 | nsnastnum | 序列号数量 | nsnastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 42 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 43 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 44 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 45 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 46 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 47 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 48 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 49 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 50 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 51 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |
| 52 | vbdef1 | 自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 53 | vbdef2 | 自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 54 | vbdef3 | 自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 55 | vbdef4 | 自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 56 | vbdef5 | 自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 57 | vbdef6 | 自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 58 | vbdef7 | 自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 59 | vbdef8 | 自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 60 | vbdef9 | 自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 61 | vbdef10 | 自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 62 | vbdef11 | 自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 63 | vbdef12 | 自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 64 | vbdef13 | 自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 65 | vbdef14 | 自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 66 | vbdef15 | 自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 67 | vbdef16 | 自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 68 | vbdef17 | 自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 69 | vbdef18 | 自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 70 | vbdef19 | 自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 71 | vbdef20 | 自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |
| 72 | vbdef21 | 自定义项21 | vbdef21 | varchar(101) |  | 自定义项 (Custom) |
| 73 | vbdef22 | 自定义项22 | vbdef22 | varchar(101) |  | 自定义项 (Custom) |
| 74 | vbdef23 | 自定义项23 | vbdef23 | varchar(101) |  | 自定义项 (Custom) |
| 75 | vbdef24 | 自定义项24 | vbdef24 | varchar(101) |  | 自定义项 (Custom) |
| 76 | vbdef25 | 自定义项25 | vbdef25 | varchar(101) |  | 自定义项 (Custom) |
| 77 | vbdef26 | 自定义项26 | vbdef26 | varchar(101) |  | 自定义项 (Custom) |
| 78 | vbdef27 | 自定义项27 | vbdef27 | varchar(101) |  | 自定义项 (Custom) |
| 79 | vbdef28 | 自定义项28 | vbdef28 | varchar(101) |  | 自定义项 (Custom) |
| 80 | vbdef29 | 自定义项29 | vbdef29 | varchar(101) |  | 自定义项 (Custom) |
| 81 | vbdef30 | 自定义项30 | vbdef30 | varchar(101) |  | 自定义项 (Custom) |
| 82 | vbdef31 | 自定义项31 | vbdef31 | varchar(101) |  | 自定义项 (Custom) |
| 83 | vbdef32 | 自定义项32 | vbdef32 | varchar(101) |  | 自定义项 (Custom) |
| 84 | vbdef33 | 自定义项33 | vbdef33 | varchar(101) |  | 自定义项 (Custom) |
| 85 | vbdef34 | 自定义项34 | vbdef34 | varchar(101) |  | 自定义项 (Custom) |
| 86 | vbdef35 | 自定义项35 | vbdef35 | varchar(101) |  | 自定义项 (Custom) |
| 87 | vbdef36 | 自定义项36 | vbdef36 | varchar(101) |  | 自定义项 (Custom) |
| 88 | vbdef37 | 自定义项37 | vbdef37 | varchar(101) |  | 自定义项 (Custom) |
| 89 | vbdef38 | 自定义项38 | vbdef38 | varchar(101) |  | 自定义项 (Custom) |
| 90 | vbdef39 | 自定义项39 | vbdef39 | varchar(101) |  | 自定义项 (Custom) |
| 91 | vbdef40 | 自定义项40 | vbdef40 | varchar(101) |  | 自定义项 (Custom) |
| 92 | vbdef41 | 自定义项41 | vbdef41 | varchar(101) |  | 自定义项 (Custom) |
| 93 | vbdef42 | 自定义项42 | vbdef42 | varchar(101) |  | 自定义项 (Custom) |
| 94 | vbdef43 | 自定义项43 | vbdef43 | varchar(101) |  | 自定义项 (Custom) |
| 95 | vbdef44 | 自定义项44 | vbdef44 | varchar(101) |  | 自定义项 (Custom) |
| 96 | vbdef45 | 自定义项45 | vbdef45 | varchar(101) |  | 自定义项 (Custom) |
| 97 | vbdef46 | 自定义项46 | vbdef46 | varchar(101) |  | 自定义项 (Custom) |
| 98 | vbdef47 | 自定义项47 | vbdef47 | varchar(101) |  | 自定义项 (Custom) |
| 99 | vbdef48 | 自定义项48 | vbdef48 | varchar(101) |  | 自定义项 (Custom) |
| 100 | vbdef49 | 自定义项49 | vbdef49 | varchar(101) |  | 自定义项 (Custom) |
| 101 | vbdef50 | 自定义项50 | vbdef50 | varchar(101) |  | 自定义项 (Custom) |