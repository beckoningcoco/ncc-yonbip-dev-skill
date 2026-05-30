# |<<

**发薪计划 (wa_payplan / nc.vo.wa.payplan.PayPlanVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6338.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_payplan | 主键 | pk_wa_payplan | char(20) | √ | 主键 (UFID) |
| 2 | pk_wa_class | 薪资方案 | pk_wa_class | varchar(20) |  | 薪资方案 (WaClassVO) |
| 3 | pay_cycle | 发薪周期 | pay_cycle | char(1) |  | 字符串 (String) |
| 4 | pay_day | 发薪日 | pay_day | int |  | 整数 (Integer) |
| 5 | pay_month | 发薪月 | pay_month | int |  | 整数 (Integer) |
| 6 | processbus_day | 业务处理结束日 | processbus_day | int |  | 整数 (Integer) |
| 7 | warning_day | 业务预警日 | warning_day | int |  | 整数 (Integer) |
| 8 | generate_rule | 任务生成规则 | generate_rule | int |  | 整数 (Integer) |
| 9 | responsible | 责任人 | responsible | varchar(20) |  | 用户 (user) |
| 10 | resname | 责任人姓名 | resname | varchar(40) |  | 多语文本 (MultiLangText) |
| 11 | creatorname | 创建人姓名 | creatorname | varchar(40) |  | 多语文本 (MultiLangText) |
| 12 | modifiername | 修改人姓名 | modifiername | varchar(40) |  | 多语文本 (MultiLangText) |
| 13 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 14 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 15 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 16 | creationtime | 创建日期 | creationtime | char(19) |  | 日期(结束) (UFDateEnd) |
| 17 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 18 | modifiedtime | 修改日期 | modifiedtime | char(19) |  | 日期 (UFDate) |