# |<<

**互斥设置 (gl_mutex / nc.vo.gl.mutex.mutex)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2436.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mutex | 设置标识 | pk_mutex | char(20) | √ | 主键 (UFID) |
| 2 | mutexno | 编码 | mutexno | char(10) |  | 日期 (UFDate) |
| 3 | mutexdesp | 内容描述 | mutexdesp | char(200) |  | 主键 (UFID) |
| 4 | funtclass | 处理类 | funtclass | char(50) |  | 主键 (UFID) |
| 5 | mutexcode | 排斥代码 | mutexcode | char(200) |  | 主键 (UFID) |
| 6 | checkflag | 功能代码 | checkflag | char(100) |  | 主键 (UFID) |
| 7 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |