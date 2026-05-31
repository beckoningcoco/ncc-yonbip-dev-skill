# |<<

**协同科目 (gl_reconcilesubj / nc.vo.gl.reconcilesubj.reconcilesubj)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2460.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reconcilesubj | 主键协同科目对 | pk_reconcilesubj | char(20) | √ | 主键 (UFID) |
| 2 | onesubjcode | 科目编码 | onesubjcode | char(30) |  | 主键 (UFID) |
| 3 | anothersubjcode | 对方科目编码 | anothersubjcode | char(30) |  | 主键 (UFID) |
| 4 | description | 描述 | description | char(100) |  | 主键 (UFID) |
| 5 | isonlyinnercust | 只协同内部客商 | isonlyinnercust | char(1) |  | 布尔类型 (UFBoolean) |