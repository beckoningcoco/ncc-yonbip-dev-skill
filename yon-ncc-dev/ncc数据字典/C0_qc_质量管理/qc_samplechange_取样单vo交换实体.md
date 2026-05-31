# |<<

**取样单vo交换实体 (qc_samplechange / nc.vo.qc.c007.entity.SamplingChangeHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4864.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_changebill | vo交换虚拟元数据主键 | pk_changebill | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 质检中心最新版本 | pk_org | varchar(20) |  | 组织_业务单元_质检中心 (qccenter) |
| 4 | pk_org_v | 质检中心 | pk_org_v | varchar(20) |  | 组织_业务单元_质检中心版本信息 (qccenter_v) |
| 5 | vbillcode | 虚拟vo单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 6 | ctrantypeid | 虚拟vo交易类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | vtrantypecode | 虚拟vo交易类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 8 | vbilltypecode | 虚拟vo单据类型 | vbilltypecode | varchar(20) |  | 字符串 (String) |
| 9 | fsamplingsource | 取样来源 | fsamplingsource | int |  | 取样来源 (samplingsource) |  | 0=报检取样; |