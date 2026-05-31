# |<<

**票据管理_领用申请_明细 (un_bl_inv_issapp_dt / com.yonyou.yh.nhis.bl.invc.vo.BlInvcIssAppDtVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6301.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invissappdt | 票据领用申请明细 | pk_invissappdt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_invissapp | 票据领用申请 | pk_invissapp | varchar(20) |  | 票据管理_领用申请 (blinvcissapp) |
| 5 | pk_invcate | 票据分类 | pk_invcate | varchar(20) |  | 票据分类 (InvCateVO) |
| 6 | apppkgcnt | 申请单位数 | apppkgcnt | int |  | 整数 (Integer) |
| 7 | appcnt | 申请张数 | appcnt | int |  | 整数 (Integer) |
| 8 | note | 备注 | note | varchar(256) |  | 字符串 (String) |
| 9 | pk_org_v | 所属组织版本信息 | pk_org_v | varchar(20) |  | 组织结构_财务组织结构版本信息 (finorgstru_v) |