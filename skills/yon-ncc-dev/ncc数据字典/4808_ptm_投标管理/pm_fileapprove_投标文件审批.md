# |<<

**投标文件审批 (pm_fileapprove / nc.vo.ptm.fileapprove.FileApproveHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4466.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ptmfileapprove | 投标文件审批主键 | pk_ptmfileapprove | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_project | 项目档案 | pk_project | varchar(20) |  | 项目 (project) |
| 4 | pk_org | 项目组织 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 5 | pk_org_v | 项目组织最新版本 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 6 | pk_customer | 客户名称 | pk_customer | varchar(20) |  | 客户基本信息 (customer) |
| 7 | pk_operdept | 责任部门 | pk_operdept | varchar(20) |  | 组织_部门 (dept) |
| 8 | pk_operdept_v | 责任部门最新版本 | pk_operdept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 9 | file_code | 投标文件编号 | file_code | varchar(30) |  | 字符串 (String) |
| 10 | bill_status | 单据状态 | bill_status | int |  | 项目管理单据状态 (pmbillstatus) |  | -1=自由态; |