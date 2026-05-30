# |<<

**票据管理_登记 (uh_bl_inv_reg / com.yonyou.yh.nhis.bl.invc.vo.BlInvcRegVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5937.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invreg | 票据登记主键 | pk_invreg | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | billtype | 票据登记类型 | billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 5 | pk_invcate | 票据分类 | pk_invcate | varchar(20) |  | 票据分类 (InvCateVO) |
| 6 | code_reg | 票据登记编码 | code_reg | varchar(50) |  | 字符串 (String) |
| 7 | name_reg | 票据登记名称 | name_reg | varchar(50) |  | 字符串 (String) |
| 8 | num_begin | 票据登记开始号 | num_begin | varchar(50) |  | 字符串 (String) |
| 9 | num_end | 票据登记结束号 | num_end | varchar(50) |  | 字符串 (String) |
| 10 | invpkcn | 票据包数量 | invpkcn | int |  | 整数 (Integer) |
| 11 | pk_dept_reg | 登记部门 | pk_dept_reg | varchar(20) |  | 组织_部门 (dept) |
| 12 | pk_psn_reg | 登记人员 | pk_psn_reg | varchar(20) |  | 人员基本信息 (psndoc) |
| 13 | date_reg | 登记日期 | date_reg | char(19) |  | 日期 (UFDate) |
| 14 | pk_psn_acpt | 验收人员 | pk_psn_acpt | varchar(20) |  | 用户 (user) |
| 15 | date_acpt | 验收日期时间 | date_acpt | char(19) |  | 日期 (UFDate) |
| 16 | pk_org_v | 所属组织版本信息 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 17 | eu_status | 状态 | eu_status | int |  | 票据登记管理状态 (invregstatus) |  | 0=登记; |