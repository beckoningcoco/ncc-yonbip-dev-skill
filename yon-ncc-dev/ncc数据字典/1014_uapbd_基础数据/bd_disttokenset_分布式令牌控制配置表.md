# |<<

**分布式令牌控制配置表 (bd_disttokenset / nc.vo.bd.distribute.BDDistTokenSetVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/806.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_disttokenset | 主键 | pk_disttokenset | char(20) | √ | 主键 (UFID) |
| 2 | tokencode | 令牌编码 | tokencode | varchar(50) |  | 字符串 (String) |
| 3 | tokenname | 令牌名称 | tokenname | varchar(50) |  | 字符串 (String) |
| 4 | rescodeupload | 上传任务ID | rescodeupload | varchar(100) |  | 字符串 (String) |
| 5 | rescodedown | 下发任务ID | rescodedown | varchar(100) |  | 字符串 (String) |
| 6 | mainnodecode | 主节点编码 | mainnodecode | varchar(50) |  | 字符串 (String) |