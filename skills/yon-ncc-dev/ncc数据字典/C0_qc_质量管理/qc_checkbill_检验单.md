# |<<

**检验单 (qc_checkbill / nc.vo.qc.c002.entity.CheckBillHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4829.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_checkbill | 检验单 | pk_checkbill | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 检测中心最新版本 | pk_org | varchar(20) |  | 组织_业务单元_质检中心 (qccenter) |
| 4 | pk_org_v | 检测中心 | pk_org_v | varchar(20) |  | 组织_业务单元_质检中心版本信息 (qccenter_v) |
| 5 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 6 | vbillcode | 检验单号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 7 | blatest | 最新版本 | blatest | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | iversion | 版本号 | iversion | int |  | 整数 (Integer) |
| 9 | pk_srcchkbill | 原始检验单主键 | pk_srcchkbill | char(20) |  | 主键 (UFID) |
| 10 | vtrantypecode | 检验类型编码编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 11 | ctrantypeid | 检验类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 12 | fbillstatus | 单据状态 | fbillstatus | int |  | QC单据状态 (QCBillStatusEnum) |  | 0=自由; |