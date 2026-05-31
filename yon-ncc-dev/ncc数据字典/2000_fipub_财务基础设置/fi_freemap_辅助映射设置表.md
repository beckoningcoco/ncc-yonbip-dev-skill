# |<<

**辅助映射设置表 (fi_freemap / nc.vo.fipub.freevalue.FreeMapVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2197.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_freemap | 辅助映射标识 | pk_freemap | char(22) | √ | 字符串 (String) |
| 2 | num | 序号 | num | int |  | 整数 (Integer) |
| 3 | isdef | 是否自定义 | isdef | char(1) |  | 布尔类型 (UFBoolean) |
| 4 | pk_checktype | 辅助类别 | pk_checktype | char(20) | √ | 字符串 (String) |
| 5 | doccode | 档案编码 | doccode | varchar(20) |  | 字符串 (String) |
| 6 | docname | 档案名称 | docname | varchar(20) |  | 字符串 (String) |
| 7 | modifytime | 修改时间 | modifytime | char(19) |  | 字符串 (String) |
| 8 | mod | 模块 | mod | char(2) |  | 字符串 (String) |
| 9 | modifier | 修改人 | modifier | char(20) |  | 字符串 (String) |