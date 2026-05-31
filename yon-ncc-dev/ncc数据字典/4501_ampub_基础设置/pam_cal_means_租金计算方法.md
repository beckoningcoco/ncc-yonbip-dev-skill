# |<<

**租金计算方法 (pam_cal_means / nc.vo.am.calculatemeans.CaculateMeansVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4233.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cal_means | 主键 | pk_cal_means | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资产组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 资产组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | method_code | 计算方法编码 | method_code | varchar(80) |  | 字符串 (String) |
| 6 | method_name | 计算方法名称 | method_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | func_ref | 计算公式 | func_ref | varchar(2000) |  | 字符串 (String) |
| 8 | func_content | 公式显示 | func_content | varchar(2000) |  | 字符串 (String) |
| 9 | type | 类型 | type | int |  | 租金计算方法类型 (CalculateMeansType) |  | 1=通用; |