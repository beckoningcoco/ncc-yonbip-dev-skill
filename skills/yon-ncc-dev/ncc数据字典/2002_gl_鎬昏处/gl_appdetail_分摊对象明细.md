# |<<

**分摊对象明细 (gl_appdetail / nc.vo.gl.apportion.AppdetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2346.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_appdetail | 分摊明细标识 | pk_appdetail | char(20) | √ | 主键 (UFID) |
| 2 | linenum | 序号 | linenum | int |  | 整数 (Integer) |
| 3 | itempercent | 比例 | itempercent | decimal(28, 8) |  | 数值 (UFDouble) |