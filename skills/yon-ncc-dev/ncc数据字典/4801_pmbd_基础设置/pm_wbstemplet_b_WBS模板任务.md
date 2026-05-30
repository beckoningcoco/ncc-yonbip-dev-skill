# |<<

**WBS模板任务 (pm_wbstemplet_b / nc.vo.pmbd.wbstemplet.WbsTempletBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4562.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wbstemplet_b | 模板任务主键 | pk_wbstemplet_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 项目组织 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | wbs_code | 任务编码 | wbs_code | varchar(40) |  | 字符串 (String) |
| 5 | wbs_name | 任务名称 | wbs_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | description | 任务描述 | description | varchar(50) |  | 字符串 (String) |
| 7 | pk_duty_dept | 责任部门 | pk_duty_dept | varchar(20) |  | 组织_部门 (dept) |
| 8 | pk_duty_dept_v | 责任部门版本 | pk_duty_dept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 9 | pk_dutyer | 责任人 | pk_dutyer | varchar(20) |  | 人员基本信息 (psndoc) |
| 10 | standard_date_num | 标准工期 | standard_date_num | int |  | 整数 (Integer) |
| 11 | planmodel | 计划模式 | planmodel | int |  | 计划模式 (planmodel) |  | 1=由上至下; |