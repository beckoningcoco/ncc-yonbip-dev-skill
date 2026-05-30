# |<<

**企业信息管理 (scapto_enterprise / nc.vo.scapto.enterprise.EnterpriseVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5124.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_enterprise | 企业信息管理主键 | pk_enterprise | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 企业名称 | pk_org | varchar(20) |  | 组织_业务单元_行政组织 (adminorg) |
| 4 | pk_org_v | 企业名称版本 | pk_org_v | varchar(20) |  | 组织_业务单元_行政组织版本信息 (adminorg_v) |
| 5 | code | 企业编码 | code | varchar(64) | √ | 字符串 (String) |
| 6 | name | 企业全称 | name | varchar(512) |  | 多语文本 (MultiLangText) |
| 7 | shortname | 企业简称 | shortname | varchar(32) |  | 多语文本 (MultiLangText) |
| 8 | vdomestic | 境内境外标志 | vdomestic | varchar(50) |  | 境内境外标志 (DomesticEnum) |  | 1=境内; |