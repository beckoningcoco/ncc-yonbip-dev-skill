# |<<

**系统集成编码对照 (bd_inter_code_map / com.yonyou.yh.nhis.bd.intercodemap.vo.InterCodeMapVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/870.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_intercodemap | 对照记录主键 | pk_intercodemap | char(20) | √ | 主键 (UFID) |
| 2 | cretime | 创建时间 | cretime | char(19) |  | 日期时间 (UFDateTime) |
| 3 | cremethod | 创建方式 | cremethod | int |  | 创建方式 (InterCodeCretTypeEnum) |  | 0=手工创建; |