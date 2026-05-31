# |<<

**作业任务定义 (ssctp_node / nc.vo.ssctp.sscbd.SSCNodeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5654.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sscnode | 唯一标识 | pk_sscnode | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) |  | 字符串 (String) |
| 6 | src | 来源 | src | varchar(50) |  | 来源 (nodesrc) |  | system=系统预置; |