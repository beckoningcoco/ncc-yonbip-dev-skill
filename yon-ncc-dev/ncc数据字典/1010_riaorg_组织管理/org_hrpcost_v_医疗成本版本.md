# |<<

**医疗成本版本 (org_hrpcost_v / nc.vo.vorg.HrpCostVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4085.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vid | 版本主键 | pk_vid | char(20) | √ | 主键 (UFID) |
| 2 | pk_hrpcost | 主键 | pk_hrpcost | varchar(50) | √ | 字符串 (String) |
| 3 | costcode | 编码 | costcode | varchar(50) |  | 字符串 (String) |
| 4 | costname | 名称 | costname | varchar(50) |  | 字符串 (String) |
| 5 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (ebablestatus) |  | 1=未启用; |