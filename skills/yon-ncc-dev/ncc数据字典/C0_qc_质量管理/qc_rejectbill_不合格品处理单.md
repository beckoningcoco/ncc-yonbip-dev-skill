# |<<

**不合格品处理单 (qc_rejectbill / nc.vo.qc.c004.entity.RejectBillHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4852.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rejectbill | 不合格品处理单 | pk_rejectbill | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 质检中心最新版本 | pk_org | varchar(20) |  | 组织_业务单元_质检中心 (qccenter) |
| 3 | pk_org_v | 质检中心 | pk_org_v | varchar(20) |  | 组织_业务单元_质检中心版本信息 (qccenter_v) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | vbillcode | 不合格品处理单号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 6 | pk_stockorg | 库存组织最新版本 | pk_stockorg | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 7 | pk_stockorg_v | 库存组织 | pk_stockorg_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 8 | pk_applydept | 报检部门最新版本 | pk_applydept | varchar(20) |  | 组织_部门 (dept) |
| 9 | pk_applydept_v | 报检部门 | pk_applydept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 10 | capplytime | 报检时间 | capplytime | varchar(19) |  | 日期时间 (UFDateTime) |
| 11 | pk_customer | 客户 | pk_customer | varchar(20) |  | 客户基本信息 (customer) |
| 12 | pk_supplier | 供应商 | pk_supplier | varchar(20) |  | 供应商基本信息 (supplier) |
| 13 | pk_project | 项目 | pk_project | varchar(20) |  | 项目 (project) |
| 14 | pk_chkdept | 检验部门最新版本 | pk_chkdept | varchar(20) |  | 组织_部门 (dept) |
| 15 | pk_chkdept_v | 检验部门 | pk_chkdept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 16 | pk_reportbill | 质检报告主键 | pk_reportbill | varchar(20) |  | 主键 (UFID) |
| 17 | vreportbillcode | 质检报告号 | vreportbillcode | varchar(40) |  | 字符串 (String) |
| 18 | pk_applybill | 报检单主键 | pk_applybill | varchar(20) |  | 主键 (UFID) |
| 19 | vapplybillcode | 报检单号 | vapplybillcode | varchar(40) |  | 字符串 (String) |
| 20 | fbillstatus | 单据状态 | fbillstatus | int |  | QC单据状态 (QCBillStatusEnum) |  | 0=自由; |