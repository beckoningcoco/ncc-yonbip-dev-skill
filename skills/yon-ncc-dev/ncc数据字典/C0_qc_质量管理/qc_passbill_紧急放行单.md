# |<<

**紧急放行单 (qc_passbill / nc.vo.qc.c005.entity.PassBillHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4847.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_passbill | 紧急放行单 | pk_passbill | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 质检中心最新版本 | pk_org | varchar(20) |  | 组织_业务单元_质检中心 (qccenter) |
| 4 | pk_org_v | 质检中心 | pk_org_v | varchar(20) |  | 组织_业务单元_质检中心版本信息 (qccenter_v) |
| 5 | vbillcode | 紧急放行单号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 6 | csourceidh | 来源单据主键 | csourceidh | varchar(20) |  | 主键 (UFID) |
| 7 | csourcetypecodeh | 来源单据类型 | csourcetypecodeh | varchar(20) |  | 单据类型 (BilltypeVO) |
| 8 | vsourcetrantypeh | 来源交易类型 | vsourcetrantypeh | varchar(20) |  | 单据类型 (BilltypeVO) |
| 9 | vsourcecodeh | 来源单据号 | vsourcecodeh | varchar(40) |  | 字符串 (String) |
| 10 | dsourcedate | 来源业务日期 | dsourcedate | varchar(19) |  | 日期 (UFDate) |
| 11 | pk_stockorg | 库存组织最新版本 | pk_stockorg | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 12 | pk_stockorg_v | 库存组织 | pk_stockorg_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 13 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 14 | pk_proddept | 生产部门最新版本 | pk_proddept | varchar(20) |  | 组织_部门 (dept) |
| 15 | pk_proddept_v | 生产部门 | pk_proddept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 16 | pk_applyorg | 申请单位最新版本 | pk_applyorg | varchar(20) |  | 组织 (org) |
| 17 | pk_applyorg_v | 申请单位 | pk_applyorg_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 18 | pk_applydept | 申请部门最新版本 | pk_applydept | varchar(20) |  | 组织_部门 (dept) |
| 19 | pk_applydept_v | 申请部门 | pk_applydept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 20 | pk_applypsn | 申请人 | pk_applypsn | varchar(20) |  | 人员基本信息 (psndoc) |
| 21 | tapplytime | 申请日期 | tapplytime | varchar(19) |  | 日期 (UFDate) |
| 22 | vapplyreason | 申请原因 | vapplyreason | varchar(181) |  | 字符串 (String) |
| 23 | fbillstatus | 单据状态 | fbillstatus | int |  | 单据状态 (passbillstatus) |  | 0=自由; |