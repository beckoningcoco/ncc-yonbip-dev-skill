# |<<

**版本记录 (ipmrm_enterprise_version / nc.vo.ipmrm.enterpriseinfo.EnterpriseinfoVersionBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3376.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version | 版本记录主键 | pk_version | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | version | 版本号 | version | int |  | 整数 (Integer) |
| 5 | version_source | 版本来源 | version_source | varchar(50) |  | 版本来源 (EnterpriseVersionSource) |  | 1=占有产权登记; |