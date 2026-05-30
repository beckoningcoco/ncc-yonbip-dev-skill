# |<<

**现金流量规则明细 (gl_busruledetail / nc.vo.gl.busrule.busruledetail)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2360.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_busruledetail | 规则明细标识 | pk_busruledetail | char(20) | √ | 主键 (UFID) |
| 2 | aspect | 方向 | aspect | int |  | 整数 (Integer) |
| 3 | pk_group | 所属集团 | pk_group | char(20) |  | 字符串 (String) |
| 4 | pk_org | 所属组织 | pk_org | char(20) |  | 字符串 (String) |