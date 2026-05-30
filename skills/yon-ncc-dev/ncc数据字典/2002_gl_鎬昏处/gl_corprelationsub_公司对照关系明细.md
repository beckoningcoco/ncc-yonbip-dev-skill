# |<<

**公司对照关系明细 (gl_corprelationsub / nc.vo.gl.corprelation.corprelationsub)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2396.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_relationsub | 关系设置子表标识 | pk_relationsub | char(20) | √ | 主键 (UFID) |
| 2 | bself | 本方标志（Y-本方，N-对方） | bself | char(1) |  | 布尔类型 (UFBoolean) |
| 3 | pk_accsubj | 会计科目 | pk_accsubj | char(20) |  | 主键 (UFID) |
| 4 | freevalueid | 辅助核算 | freevalueid | char(20) |  | 主键 (UFID) |