# |<<

**传输日志卸载配置 (adp_cleantranslogconfig / nc.vo.uap.distribution.cleantranslogconfig.CleanTransLogConfigVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | configid | 配置编号 | configid | char(20) | √ | 主键 (UFID) |
| 2 | holdingtime | 记录保留时间 | holdingtime | int |  | 整数 (Integer) |
| 3 | runcircle | 执行周期 | runcircle | int |  | 整数 (Integer) |
| 4 | trigertime | 触发时间 | trigertime | char(8) |  | 时间 (UFTime) |
| 5 | savepath | 保存路径 | savepath | varchar(250) |  | 字符串 (String) |
| 6 | firstextime | 首次执行时间 | firstextime | char(19) |  | 日期 (UFDate) |
| 7 | createuser | 创建人 | createuser | varchar(50) |  | 字符串 (String) |
| 8 | createtime | 创建时间 | createtime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | endoperator | 最后修改人 | endoperator | varchar(50) |  | 字符串 (String) |
| 10 | endopetime | 最后修改时间 | endopetime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | enablestatus | 启用状态 | enablestatus | int |  | 启用状态 (cleanlogstatus) |  | 1=已启用; |