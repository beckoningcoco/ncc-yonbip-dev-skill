# |<<

**TMS流水表(入) (scm_tmsflowin / nccloud.vo.scmpub.tms.entity.TMSFlowInVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5233.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tmsflowin | 主键 | pk_tmsflowin | char(20) | √ | 主键 (UFID) |
| 2 | flowtype | 流水类型 | flowtype | varchar(10) |  | 字符串 (String) |
| 3 | cdestbillid | 生成单据主键 | cdestbillid | varchar(20) |  | 字符串 (String) |
| 4 | systemcode | 来源系统标识 | systemcode | varchar(10) |  | 字符串 (String) |
| 5 | systembillcode | 来源系统单据号 | systembillcode | varchar(50) |  | 字符串 (String) |
| 6 | systembillid | 来源系统单据主键 | systembillid | varchar(50) |  | 字符串 (String) |
| 7 | pk_billtype | 处理单据类型 | pk_billtype | varchar(10) |  | 字符串 (String) |
| 8 | cbillid | 处理单据主键 | cbillid | varchar(20) |  | 字符串 (String) |
| 9 | cbillbid | 处理单据子主键 | cbillbid | varchar(20) |  | 字符串 (String) |
| 10 | md5code | MD5值 | md5code | varchar(32) |  | 字符串 (String) |