# |<<

**CTMSVaryTaskVO (ctms_varytask / nccloud.ctms.change.vo.CTMSVaryTaskVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1687.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | varyid | 变更号 | varyid | varchar(64) | √ | 主键 (UFID) |
| 2 | note | 说明 | note | varchar(50) |  | 字符串 (String) |
| 3 | context | 详细内容 | context | varchar(50) |  | 字符串 (String) |
| 4 | state | 状态 | state | varchar(50) |  | VaryTaskStateEnum (VaryTaskStateEnum) |  | 1=进行中; |