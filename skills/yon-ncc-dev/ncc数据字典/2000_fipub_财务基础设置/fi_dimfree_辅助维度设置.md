# |<<

**辅助维度设置 (fi_dimfree / nc.vo.fipub.freevalue.DimFreeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2195.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dimfree | 辅助维度标识 | pk_dimfree | char(20) | √ | 主键 (UFID) |
| 2 | dimcount | 维度数 | dimcount | int |  | 整数 (Integer) |
| 3 | isdef | 是否自定义 | isdef | char(1) | √ | 布尔类型 (UFBoolean) |
| 4 | createtime | 创建时间 | createtime | char(19) |  | 字符串 (String) |
| 5 | modifytime | 修改时间 | modifytime | char(19) |  | 字符串 (String) |
| 6 | tabnum | 当前表创建数 | tabnum | int |  | 整数 (Integer) |
| 7 | mod | 模块 | mod | char(2) |  | 字符串 (String) |
| 8 | modifier | 修改人 | modifier | char(20) |  | 字符串 (String) |