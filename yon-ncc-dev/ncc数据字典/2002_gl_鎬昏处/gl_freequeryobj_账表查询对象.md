# |<<

**账表查询对象 (gl_freequeryobj / nc.vo.gl.freereport.FreeQueryObjVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2423.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_freequeryobj | 主键 | pk_freequeryobj | char(20) | √ | 主键 (UFID) |
| 2 | pk_checktype | 查询对象主键 | pk_checktype | varchar(50) |  | 字符串 (String) |
| 3 | headele | 表头显示 | headele | char(1) |  | 布尔类型 (UFBoolean) |
| 4 | accele | 小计元素 | accele | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | indexno | 序号 | indexno | int |  | 整数 (Integer) |