# |<<

**内部领用 (cfbm_innerbackapply / nc.vo.cfbm.innerbackapply.InnerBackApplyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1409.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_innerbackapply | 主键 | pk_innerbackapply | char(20) | √ | 主键 (UFID) |
| 2 | vbillno | 单据编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 6 | trusttype | 托管类型 | trusttype | varchar(50) |  | 托管类型 (TrustTypeEnum) |  | keep=保管托管; |