# |<<

**互斥设置子表 (gl_mutexstatus / nc.vo.gl.mutex.mutexstatus)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2437.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | mutexno | 编号 | mutexno | char(10) | √ | 日期 (UFDate) |
| 2 | mutexstatus | 状态 | mutexstatus | char(4) |  | 主键 (UFID) |
| 3 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |