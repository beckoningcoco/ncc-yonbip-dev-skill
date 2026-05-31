# |<<

**质证书 (qc_certbill / nc.vo.qc.c006.entity.CertHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4825.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_certbill | 质证书主键 | pk_certbill | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 质检中心最新版本 | pk_org | varchar(20) |  | 组织_业务单元_质检中心 (qccenter) |
| 3 | pk_org_v | 质检中心 | pk_org_v | varchar(20) |  | 组织_业务单元_质检中心版本信息 (qccenter_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | vbillcode | 质证书号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 6 | fbillstatus | 单据状态 | fbillstatus | int |  | 质证书单据状态 (certbillstatus) |  | 0=自由; |