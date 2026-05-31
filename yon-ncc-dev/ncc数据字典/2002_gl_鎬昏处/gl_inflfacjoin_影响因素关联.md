# |<<

**影响因素关联 (gl_inflfacjoin / nc.vo.gl.reconcile.inflfacjoin.InflFacJoinVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2426.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_inflfacjoin | 主键 | pk_inflfacjoin | char(20) | √ | 主键 (UFID) |
| 2 | pk_influecefactor | 影响因素 | pk_influecefactor | varchar(20) | √ | 总账影响因素 (influecefactor) |
| 3 | detailfield | 分录字段 | detailfield | varchar(50) | √ | 字符串 (String) |
| 4 | jointype | 关联方式 | jointype | varchar(50) | √ | 关联方式 (jointype) |  | 1=等于; |