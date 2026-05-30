# |<<

**物资需求申请单 (po_storereq / nc.vo.pu.m422x.entity.StoreReqAppHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4636.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_storereq | 物资需求申请单 | pk_storereq | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | vbillcode | 申请单号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 6 | dbilldate | 申请日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 7 | pk_appdepth | 申请部门最新版本 | pk_appdepth | varchar(20) |  | 组织_部门 (dept) |
| 8 | pk_appdepth_v | 申请部门 | pk_appdepth_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 9 | pk_apppsnh | 申请人 | pk_apppsnh | varchar(20) |  | 人员基本信息 (psndoc) |
| 10 | vtrantypecode | 单据类型编码编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 11 | fbillstatus | 单据状态 | fbillstatus | int |  | 单据状态 (reqstatus) | 0 | 0=自由; |