# |<<

**收证修改子表信息 (lcm_receivemodify_b / nc.vo.lcm.receive.receivemodify.ReceiveModifyBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3579.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_receivemodify_b | 修改信息主键 | pk_receivemodify_b | char(20) | √ | 主键 (UFID) |
| 2 | modifyitem | 修改条款 | modifyitem | varchar(50) |  | 字符串 (String) |
| 3 | modifybefore | 修改前 | modifybefore | varchar(181) |  | 字符串 (String) |
| 4 | modifyafter | 修改后 | modifyafter | varchar(181) |  | 字符串 (String) |
| 5 | summary | 摘要 | summary | varchar(181) |  | 字符串 (String) |
| 6 | modifyitemkey | 修改单据项编码 | modifyitemkey | varchar(50) |  | 字符串 (String) |